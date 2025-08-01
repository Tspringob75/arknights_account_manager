package arknights.models;

public class OperatorSkill {
    private int skillId;
    private int operatorId;
    private String skillName;

    // Default constructor
    public OperatorSkill() {

    }

    // For ease of testing
    public OperatorSkill(int skillId, int operatorId, String skillName) {
        this.skillId = skillId;
        this.operatorId = operatorId;
        this.skillName = skillName;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public int getOperator() {
        return operatorId;
    }

    public void setOperator(int operatorId) {
        this.operatorId = operatorId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
}
