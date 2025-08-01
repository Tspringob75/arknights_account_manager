package arknights.models;

public class CollectedOperator {
    private int collectedOperatorId;
    private int operatorId;
    private int accountId;
    private int operatorLevel;
    private PromotionLevel promotion;
    private int potential;
    private int skillLevel;
    private int moduleLevel;

    // Default constructor
    public CollectedOperator() {

    }

    //  // For ease of testing
    public CollectedOperator(int collectedOperatorId, int operatorId, int accountId, int operatorLevel,
                             PromotionLevel promotion, int potential, int skillLevel, int moduleLevel) {
        this.collectedOperatorId = collectedOperatorId;
        this.operatorId = operatorId;
        this.accountId = accountId;
        this.operatorLevel = operatorLevel;
        this.promotion = promotion;
        this.potential = potential;
        this.skillLevel = skillLevel;
        this.moduleLevel = moduleLevel;
    }

    public int getCollectedOperatorId() {
        return collectedOperatorId;
    }

    public void setCollectedOperatorId(int collectedOperatorId) {
        this.collectedOperatorId = collectedOperatorId;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getOperatorLevel() {
        return operatorLevel;
    }

    public void setOperatorLevel(int operatorLevel) {
        this.operatorLevel = operatorLevel;
    }

    public PromotionLevel getPromotion() {
        return promotion;
    }

    public void setPromotion(PromotionLevel promotion) {
        this.promotion = promotion;
    }

    public int getPotential() {
        return potential;
    }

    public void setPotential(int potential) {
        this.potential = potential;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public int getModuleLevel() {
        return moduleLevel;
    }

    public void setModuleLevel(int moduleLevel) {
        this.moduleLevel = moduleLevel;
    }
}
