package arknights.models;

public enum Rarity {
    ONE_STAR(1, "*"),
    TWO_STAR(2, "**"),
    THREE_STAR(3, "***"),
    FOUR_STAR(4, "****"),
    FIVE_STAR(5, "*****"),
    SIX_STAR(6, "******");

    private final int id;
    private final String name;

    Rarity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Rarity findById(int id) {
        for (Rarity rarity : Rarity.values()) {
            if (rarity.getId() == id) {
                return rarity;
            }
        }
        String message = String.format("No Rarity with id: %s", id);
        throw new RuntimeException(message);
    }

    public static Rarity findByName(String name) {
        for (Rarity rarity : Rarity.values()) {
            if (rarity.getName().equalsIgnoreCase(name)) {
                return rarity;
            }
        }
        String message = String.format("No Rarity with name: %s", name);
        throw new RuntimeException(message);
    }
}
