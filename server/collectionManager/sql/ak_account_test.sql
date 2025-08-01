drop database if exists ak_account_test;
create database ak_account_test;
use ak_account_test;

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

-- Set up testing
delimiter //
create procedure set_known_good_state()
begin
	delete from collected_skill;
    alter table collected_skill auto_increment = 1;
    delete from collected_operator;
    alter table collected_operator auto_increment = 1;
    delete from operator_skill;
    alter table operator_skill auto_increment = 1;
    delete from operator_attributes;
    alter table operator_attributes auto_increment = 1;
    delete from operator;
    alter table operator auto_increment = 1;
    delete from `account`;
    alter table `account` auto_increment = 1;
    
    insert into operator(operator_id, rarity_id, branch_id, operator_name, has_module)
    values
    (1, 6, 24, 'Ch''en', 1),
    (2, 6, 35, 'Reed the Flame Shadow', 1),
    (3, 6, 31, 'Kal''tsit', 1);
    
    insert into operator_attributes(attributes_id, operator_id, 
    unpromoted_hp, e1_hp, e2_hp,
    unpromoted_atk, e1_atk, e2_atk,  
    unpromoted_def, e1_def, e2_def, 
    unpromoted_res, e1_res, e2_res, 
    redeploy, dp_cost, block_count, atk_interval)
    values
    (1, 1, 
    '1229 - 1684', '1684 - 2188', '2188 - 2880', 
    '249 - 361', '361 - 469', '469 - 610',
    '154 - 221', '221 - 288', '288 - 352',
    0, 0, 0,
    '70 seconds', '19/21/23', '2', '1.3 seconds'),
    
    (2, 2, 
    '868 - 1143', '1143 - 1361', '1361 - 1583',
    '192 - 316', '316 - 440', '440 - 550',
    '36 - 53', '53 - 67', '67 - 84',
    10, 15, 20,
    '70 seconds', '15/17', '1', '1.6 seconds'),
    
    (3, 3,
    '865 - 1219', '1219 - 1469', '1469 - 1633',
    '167 - 274', '274 - 392', '392 - 490',
    '94 - 137', '137 - 172', '172 - 215',
    0, 0, 0, 
    '70 seconds', '18/20', '1', '2.85 seconds');
    
    insert into operator_skill(skill_id, operator_id, skill_name)
    values
    (1, 1, 'Sheated Strike'),
    (2, 1, 'Chi Xiao - Unsheath'),
    (3, 1, 'Chi Xiao - Shadowless'),
    (4, 2, 'Swift Strike γ'),
    (5, 2, 'Wither and Thrive'),
    (6, 2, 'Ember of Life'),
    (7, 3, 'Command: Structural Fortification'),
    (8, 3, 'Command: Tactical Coordination'),
    (9, 3, 'Command: Meltdown');
    
    insert into `account` (account_id, username, email, password_hash, `role`, operators_collected, restricted)
    values 
    (1, 'Pneuma', 'test@test.com', 'password', 'ADMIN', 2, 0);
    
    insert into collected_operator(collected_operated_id, operator_id, account_id, operator_level, 
    operator_promotion, operator_potential, operator_skill_level, module_level)
    values
    (1, 1, 1, 90, 'elite 2', 6, 7, 3),
    (2, 2, 1, 80, 'elite 2', 3, 7, 3);
    
    insert into collected_skill(collected_skill_id, collected_operator_id, skill_id, skill_mastery)
    values
    (1, 1, 1, 3),
    (2, 1, 2, 3),
    (3, 1, 3, 3),
    (4, 2, 4, 1),
    (5, 2, 5, 2),
    (6, 2, 6, 3);
end //
    
    
