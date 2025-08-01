package arknights.models;

public class OperatorAttributes {
    private int attributesId;
    private int operatorId;
    private String unpromotedHp;
    private String e1Hp;
    private String e2Hp;

    private String unpromotedAtk;
    private String e1Atk;
    private String e2Atk;

    private String unpromotedDef;
    private String e1Def;
    private String e2Def;

    private int unpromotedRes;
    private int e1Res;
    private int e2Res;

    private String redeploy;
    private String dpCost;
    private String blockCount;
    private String atkInterval;

    // Default constructor
    public OperatorAttributes() {

    }


    // For ease of testing
    public OperatorAttributes(int attributesId, int operatorId, String unpromotedHp, String e1Hp, String e2Hp,
                              String unpromotedAtk, String e1Atk, String e2Atk,
                              String unpromotedDef, String e1Def, String e2Def,
                              int unpromotedRes, int e1Res, int e2Res,
                              String redeploy, String dpCost, String blockCount, String atkInterval) {
        this.attributesId = attributesId;
        this.operatorId = operatorId;
        this.unpromotedHp = unpromotedHp;
        this.e1Hp = e1Hp;
        this.e2Hp = e2Hp;
        this.unpromotedAtk = unpromotedAtk;
        this.e1Atk = e1Atk;
        this.e2Atk = e2Atk;
        this.unpromotedDef = unpromotedDef;
        this.e1Def = e1Def;
        this.e2Def = e2Def;
        this.unpromotedRes = unpromotedRes;
        this.e1Res = e1Res;
        this.e2Res = e2Res;
        this.redeploy = redeploy;
        this.dpCost = dpCost;
        this.blockCount = blockCount;
        this.atkInterval = atkInterval;
    }

    public int getOperator() {
        return operatorId;
    }

    public void setOperator(int operatorId) {
        this.operatorId = operatorId;
    }

    public String getUnpromotedHp() {
        return unpromotedHp;
    }

    public void setUnpromotedHp(String unpromotedHp) {
        this.unpromotedHp = unpromotedHp;
    }

    public String getE1Hp() {
        return e1Hp;
    }

    public void setE1Hp(String e1Hp) {
        this.e1Hp = e1Hp;
    }

    public String getE2Hp() {
        return e2Hp;
    }

    public void setE2Hp(String e2Hp) {
        this.e2Hp = e2Hp;
    }

    public String getUnpromotedAtk() {
        return unpromotedAtk;
    }

    public void setUnpromotedAtk(String unpromotedAtk) {
        this.unpromotedAtk = unpromotedAtk;
    }

    public String getE1Atk() {
        return e1Atk;
    }

    public void setE1Atk(String e1Atk) {
        this.e1Atk = e1Atk;
    }

    public String getE2Atk() {
        return e2Atk;
    }

    public void setE2Atk(String e2Atk) {
        this.e2Atk = e2Atk;
    }

    public String getUnpromotedDef() {
        return unpromotedDef;
    }

    public void setUnpromotedDef(String unpromotedDef) {
        this.unpromotedDef = unpromotedDef;
    }

    public String getE1Def() {
        return e1Def;
    }

    public void setE1Def(String e1Def) {
        this.e1Def = e1Def;
    }

    public String getE2Def() {
        return e2Def;
    }

    public void setE2Def(String e2Def) {
        this.e2Def = e2Def;
    }

    public int getUnpromotedRes() {
        return unpromotedRes;
    }

    public void setUnpromotedRes(int unpromotedRes) {
        this.unpromotedRes = unpromotedRes;
    }

    public int getE1Res() {
        return e1Res;
    }

    public void setE1Res(int e1Res) {
        this.e1Res = e1Res;
    }

    public int getE2Res() {
        return e2Res;
    }

    public void setE2Res(int e2Res) {
        this.e2Res = e2Res;
    }

    public String getRedeploy() {
        return redeploy;
    }

    public void setRedeploy(String redeploy) {
        this.redeploy = redeploy;
    }

    public String getDpCost() {
        return dpCost;
    }

    public void setDpCost(String dpCost) {
        this.dpCost = dpCost;
    }

    public String getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(String blockCount) {
        this.blockCount = blockCount;
    }

    public String getAtkInterval() {
        return atkInterval;
    }

    public void setAtkInterval(String atkInterval) {
        this.atkInterval = atkInterval;
    }
}
