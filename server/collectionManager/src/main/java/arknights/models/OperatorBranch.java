package arknights.models;

public enum OperatorBranch {
    // Caster branches
    CORE_CASTER(1, OperatorClass.CASTER,  "core"),
    SPLASH_CASTER(2, OperatorClass.CASTER, "splash"),
    BLAST_CASTER(3, OperatorClass.CASTER, "blast"),
    CHAIN_CASTER(4, OperatorClass.CASTER, "chain"),
    MECH_ACCORD_CASTER(5, OperatorClass.CASTER, "mech-accord"),
    PHALANX_CASTER(6, OperatorClass.CASTER, "phalanx"),
    PRIMAL_CASTER(7, OperatorClass.CASTER, "primal"),
    SHAPER_CASTER(8, OperatorClass.CASTER, "shaper"),

    // Defender branches
    PROTECTOR_DEFENDER(9, OperatorClass.DEFENDER, "protector"),
    GUARDIAN_DEFENDER(10, OperatorClass.DEFENDER, "guardian"),
    JUGGERNAUT_DEFENDER(11, OperatorClass.DEFENDER, "juggernaut"),
    ARTS_PROTECTOR_DEFENDER(12, OperatorClass.DEFENDER, "arts protector"),
    DUELIST_DEFENDER(13, OperatorClass.DEFENDER, "duelist"),
    FORTRESS_DEFENDER(14, OperatorClass.DEFENDER, "fortress"),
    SENTRY_PROTECTOR_DEFENDER(15, OperatorClass.DEFENDER, "sentry protector"),
    PRIMAL_PROTECTOR_DEFENDER(16, OperatorClass.DEFENDER, "primal protector"),

    // Guard branches
    DREADNOUGHT_GUARD(17, OperatorClass.GUARD, "dreadnought"),
    CENTURION_GUARD(18, OperatorClass.GUARD, "centurion"),
    LORD_GUARD(19, OperatorClass.GUARD, "lord"),
    ARTS_FIGHTER_GUARD(20, OperatorClass.GUARD, "arts fighter"),
    INSTRUCTOR_GUARD(21, OperatorClass.GUARD, "instructor"),
    FIGHTER_GUARD(22, OperatorClass.GUARD, "fighter"),
    SWORDMASTER_GUARD(23, OperatorClass.GUARD, "swordmaster"),
    SOLOBLADE_GUARD(24, OperatorClass.GUARD, "soloblade"),
    LIBERATOR_GUARD(25, OperatorClass.GUARD, "liberator"),
    REAPER_GUARD(26, OperatorClass.GUARD, "reaper"),
    CRUSHER_GUARD(27, OperatorClass.GUARD, "crusher"),
    EARTHSHAKER_GUARD(28, OperatorClass.GUARD, "earthshaker"),
    PRIMAL_GUARD(29, OperatorClass.GUARD, "primal"),

    // Medic branches
    MEDIC_MEDIC(30, OperatorClass.MEDIC, "medic"),
    MULTI_TARGET_MEDIC(31, OperatorClass.MEDIC, "multi target"),
    THERAPIST_MEDIC(32, OperatorClass.MEDIC, "therapist"),
    WANDERING_MEDIC(33, OperatorClass.MEDIC, "wandering"),
    INCANTATION_MEDIC(34, OperatorClass.MEDIC, "incantation"),
    CHAIN_MEDIC(35, OperatorClass.MEDIC, "chain"),

    // Sniper branches
    MARKSMAN_SNIPER(36, OperatorClass.SNIPER, "marksman"),
    ARTILLERYMAN_SNIPER(37, OperatorClass.SNIPER, "artilleryman"),
    DEADEYE_SNIPER(38, OperatorClass.SNIPER, "deadeye"),
    HEAVYSHOOTER_SNIPER(39, OperatorClass.SNIPER, "heavyshooter"),
    SPREADSHOOTER_SNIPER(40, OperatorClass.SNIPER, "spreadshooter"),
    BESIEGER_SNIPER(41, OperatorClass.SNIPER, "besieger"),
    FLINGER_SNIPER(42, OperatorClass.SNIPER, "flinger"),
    HUNTER_SNIPER(43, OperatorClass.SNIPER, "hunter"),
    LOOPSHOOTER_SNIPER(44, OperatorClass.SNIPER, "loopshooter"),

    // Specialist branches
    PUSH_STROKER_SPECIALIST(45, OperatorClass.SPECIALIST, "push stroker"),
    HOOKMASTER_SPECIALIST(46, OperatorClass.SPECIALIST, "hookmaster"),
    EXECUTOR_SPECIALIST(47, OperatorClass.SPECIALIST, "executor"),
    AMBUSHER_SPECIALIST(48, OperatorClass.SPECIALIST, "ambusher"),
    GEEK_SPECIALIST(49, OperatorClass.SPECIALIST, "geek"),
    MERCHANT_SPECIALIST(50, OperatorClass.SPECIALIST, "merchant"),
    TRAPMASTER_SPECIALIST(51, OperatorClass.SPECIALIST, "trapmaster"),
    DOLLKEEPER_SPECIALIST(52, OperatorClass.SPECIALIST, "dollkeeper"),
    ALCEHMIST_SPECIALIST(53, OperatorClass.SPECIALIST, "alchemist"),
    SKYRANGER_SPECIALIST(54, OperatorClass.SPECIALIST, "skyranger"),

    // Supporter branches
    DECAL_BINDER_SUPPORTER(55, OperatorClass.SUPPORTER, "decal binder"),
    SUMMONER_SUPPORTER(56, OperatorClass.SUPPORTER, "summoner"),
    HEXER_SUPPORTER(57, OperatorClass.SUPPORTER, "hexer"),
    BARD_SUPPORTER(58, OperatorClass.SUPPORTER, "bard"),
    ABJURER_SUPPORTER(59, OperatorClass.SUPPORTER, "abjurer"),
    ARTIFICER_SUPPORTER(60, OperatorClass.SUPPORTER, "artificer"),
    RITUALIST_SUPPORTER(61, OperatorClass.SUPPORTER, "ritualist"),

    // Vanguard branches
    PIONEER_VANGUARD(62, OperatorClass.VANGUARD, "pioneer"),
    CHARGER_VANGUARD(63, OperatorClass.VANGUARD, "charger"),
    STANDARD_BEARER_VANGUARD(64, OperatorClass.VANGUARD, "standard bearer"),
    TACTICIAN_VANGUARD(65, OperatorClass.VANGUARD, "tactician"),
    AGENT_VANGUARD(66, OperatorClass.VANGUARD, "agent");

    private final int id;
    private final OperatorClass operatorClass;
    private final String name;


    OperatorBranch(int id, OperatorClass operatorClass, String name) {
        this.id = id;
        this.operatorClass = operatorClass;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public OperatorClass getOperatorClass() {
        return operatorClass;
    }

    public String getName() {
        return name;
    }

    public OperatorBranch findById(int id) {
        for (OperatorBranch operatorBranch : OperatorBranch.values()) {
            if (operatorBranch.id == id) {
                return operatorBranch;
            }
        }
        String message = String.format("No Operator branch with id: %s", id);
        throw new RuntimeException(message);
    }

    public OperatorBranch findByName(String name) {
        for (OperatorBranch operatorBranch : OperatorBranch.values()) {
            if (operatorBranch.name.equalsIgnoreCase(name)) {
                return operatorBranch;
            }
        }
        String message = String.format("No Operator branch with name: %s", name);
        throw new RuntimeException(message);
    }
}
