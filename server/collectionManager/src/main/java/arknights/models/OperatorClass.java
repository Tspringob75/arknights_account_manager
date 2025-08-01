package arknights.models;

public enum OperatorClass {
    CASTER(1, "caster"),
    DEFENDER(2, "defender"),
    GUARD(3, "guard"),
    MEDIC(4, "medic"),
    SNIPER(5, "sniper"),
    SPECIALIST(6, "specialist"),
    SUPPORTER(7, "supporter"),
    VANGUARD(8, "vanguard");

    private final int id;
    private final String name;


    OperatorClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public OperatorClass findById(int id) {
        for (OperatorClass operatorClass : OperatorClass.values()) {
            if (operatorClass.id == id) {
                return operatorClass;
            }
        }
        String message = String.format("No Operator Class with id: %s", id);
        throw new RuntimeException(message);
    }

    public OperatorClass findByName(String name) {
        for (OperatorClass operatorClass : OperatorClass.values()) {
            if (operatorClass.name.equalsIgnoreCase(name)) {
                return operatorClass;
            }
        }
        String message = String.format("No Operator Class with name: %s", name);
        throw new RuntimeException(message);
    }
}
