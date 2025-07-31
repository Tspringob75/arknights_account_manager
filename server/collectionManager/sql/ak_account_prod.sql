drop database if exists ak_account;
create database ak_account;
use ak_account;

-- Create tables with no dependencies
create table `account` (
	account_id int primary key auto_increment,
    username varchar(50) not null,
    email varchar(320) not null,
    password_hash varchar(2048) not null,
    `role` varchar(20) not null default 'USER',
    operators_collected int not null default 1,
    restricted bit not null
);

create table rarity (
	rarity_id int primary key auto_increment,
    operator_rarity varchar(20) not null
);

create table class (
	class_id int primary key auto_increment,
    class_name varchar(20) not null
);

-- Tables with dependencies
create table branch (
	branch_id int primary key auto_increment,
    class_id int not null,
    branch_name varchar(20) not null,
    
    constraint fk_branch_class_id
		foreign key (class_id)
        references class(class_id)
);

create table operator (
	operator_id int primary key auto_increment,
    rarity_id int not null,
    branch_id int not null,
    operator_name varchar(50) not null,
    has_module bit not null,
    
    constraint fk_operator_rarity_id
		foreign key (rarity_id)
        references rarity(rarity_id),
	constraint fk_operator_branch_id
		foreign key (branch_id)
        references branch(branch_id)
);

create table operator_attributes (
	attributes_id int primary key auto_increment,
    operator_id int not null,
    unpromoted_hp varchar(20) not null,
    e1_hp varchar(20) not null,
    e2_hp varchar(20) not null,
    unpromoted_atk varchar(20) not null,
    e1_atk varchar(20) not null,
    e2_atk varchar(20) not null,
    unpromoted_def varchar(20) not null,
    e1_def varchar(20) not null,
    e2_def varchar(20) not null,
    unpromoted_res int not null,
    e1_res int not null,
    e2_res int not null,
    redeploy varchar(20) not null,
    dp_cost varchar(20) not null,
    block_count varchar(20) not null,
    atk_interval varchar(20) not null,
    
    constraint fk_operator_attributes_operator_id
		foreign key (operator_id)
        references operator(operator_id)
);

create table operator_skill (
	skill_id int primary key auto_increment,
    operator_id int not null,
    skill_name varchar(50) not null,
    
    constraint fk_operator_skills_operator_id
		foreign key (operator_id)
        references operator(operator_id)
);

create table collected_operator (
	collected_operator_id int primary key auto_increment,
    operator_id int not null,
    account_id int not null,
    operator_level int not null,
    operator_promotion varchar(50) not null,
    operator_potential int not null,
    operator_skill_level int not null default 1,
    module_level int,
    
    constraint fk_collected_operator_operator_id
		foreign key (operator_id)
        references operator(operator_id),
	constraint fk_collected_operator_account_id
		foreign key(account_id)
        references `account`(account_id)
);

create table collected_skill (
	collected_skill_id int primary key auto_increment,
	collected_operator_id int not null,
    skill_id int not null,
    skill_mastery int not null default 0,
    
    constraint fk_collected_skill_collected_operator_id
		foreign key (collected_operator_id)
        references collected_operator(collected_operator_id),
	constraint fk_collected_skill_skill_id
		foreign key (skill_id)
        references operator_skill(skill_id)
);
    
    
-- Static insertion that will never change
insert into rarity (rarity_id, operator_rarity)
values
(1, '*'),
(2, '**'),
(3, '***'),
(4, '****'),
(5, '*****'),
(6, '******');
    