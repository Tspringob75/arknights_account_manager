package arknights.models;

public class Operator {
    private int operatorId;
    private Rarity rarity;
    private OperatorBranch operatorBranch;
    private String operatorName;
    private boolean hasModule;

    // Default constructor
    public Operator() {

    }

    // For ease of testing
    public Operator(int operatorId, Rarity rarity, OperatorBranch operatorBranch, String operatorName, boolean hasModule) {
        this.operatorId = operatorId;
        this.rarity = rarity;
        this.operatorBranch = operatorBranch;
        this.operatorName = operatorName;
        this.hasModule = hasModule;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public OperatorBranch getOperatorBranch() {
        return operatorBranch;
    }

    public void setOperatorBranch(OperatorBranch operatorBranch) {
        this.operatorBranch = operatorBranch;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public boolean isHasModule() {
        return hasModule;
    }

    public void setHasModule(boolean hasModule) {
        this.hasModule = hasModule;
    }
}
