package arknights.models;

public enum PromotionLevel {
    UNPROMOTED(1, "unpromoted"),
    ELITE1(2, "elite 1"),
    ELITE2(3, "elite 2");

    private final int id;
    private final String name;

    PromotionLevel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
