package arknights.models;

public class CollectedSkill {
    private int collectedSkillId;
    private int collectedOperatorId;
    private int skillId;
    private int mastery;

    // Default constructor
    public CollectedSkill() {

    }

    // For ease of testing
    public CollectedSkill(int collectedSkillId, int collectedOperatorId, int skillId, int mastery) {
        this.collectedSkillId = collectedSkillId;
        this.collectedOperatorId = collectedOperatorId;
        this.skillId = skillId;
        this.mastery = mastery;
    }

    public int getCollectedSkillId() {
        return collectedSkillId;
    }

    public void setCollectedSkillId(int collectedSkillId) {
        this.collectedSkillId = collectedSkillId;
    }

    public int getCollectedOperatorId() {
        return collectedOperatorId;
    }

    public void setCollectedOperatorId(int collectedOperatorId) {
        this.collectedOperatorId = collectedOperatorId;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public int getMastery() {
        return mastery;
    }

    public void setMastery(int mastery) {
        this.mastery = mastery;
    }
}
