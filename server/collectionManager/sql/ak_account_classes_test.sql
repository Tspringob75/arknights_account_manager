use ak_account_test;

-- All the main classes
insert into class (class_id, class_name)
values
(1, 'caster'),
(2, 'defender'),
(3, 'guard'),
(4, 'medic'),
(5, 'sniper'),
(6, 'specialist'),
(7, 'supporter'),
(8, 'vanguard');
    

-- Caster branches
insert into branch(class_id, branch_name)
values
(1, 'core'),
(1, 'splash'),
(1, 'blast'),
(1, 'chain'),
(1, 'mech-accord'),
(1, 'phalanx'),
(1, 'mystic'),
(1, 'primal'),
(1, 'shaper');

-- Defender branches
insert into branch(class_id, branch_name)
values
(2, 'protector'),
(2, 'guardian'),
(2, 'juggernaut'),
(2, 'arts protector'),
(2, 'duelist'),
(2, 'fortress'),
(2, 'sentry protector'),
(2, 'primal protector');

-- Guard branches
insert into branch(class_id, branch_name)
values
(3, 'dreadnought'),
(3, 'centurion'),
(3, 'lord'),
(3, 'arts fighter'),
(3, 'instructor'),
(3, 'fighter'),
(3, 'swordmaster'),
(3, 'soloblade'),
(3, 'liberator'),
(3, 'reaper'),
(3, 'crusher'),
(3, 'earthshaker'),
(3, 'primal');

-- Medic branches
insert into branch(class_id, branch_name)
values
(4, 'medic'),
(4, 'multi-target'),
(4, 'therapist'),
(4, 'wandering'),
(4, 'incantation'),
(4, 'chain');

-- Sniper branches
insert into branch(class_id, branch_name)
values
(5, 'marksman'),
(5, 'artilleryman'),
(5, 'deadeye'),
(5, 'heavyshooter'),
(5, 'spreadshooter'),
(5, 'besieger'),
(5, 'flinger'),
(5, 'hunter'),
(5, 'loopshooter');

-- Speciast branches
insert into branch(class_id, branch_name)
values
(6, 'push stroker'),
(6, 'hookmaster'),
(6, 'executor'),
(6, 'ambusher'),
(6, 'geek'),
(6, 'merchant'),
(6, 'trapmaster'),
(6, 'dollkeeper'),
(6, 'alchemist'),
(6, 'skyranger');

-- Supporter branches
insert into branch(class_id, branch_name)
values
(7, 'decal binder'),
(7, 'summoner'),
(7, 'hexer'),
(7, 'bard'),
(7, 'abjurer'),
(7, 'artificer'),
(7, 'ritualist');

-- Vanguard branches
insert into branch(class_id, branch_name)
values
(8, 'pioneer'),
(8, 'charger'),
(8, 'standard bearer'),
(8, 'tactician'),
(8, 'agent');