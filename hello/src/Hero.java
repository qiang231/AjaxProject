public class Hero {
    private long id;
    private String nickName;
    private int level;
    private long currExp;
    private long exp;


    public Hero(){

    }

    public Hero(String nickName) {
        this.nickName = nickName;
    }

    public Hero(long id, String nickName, int level, long exp) {
        this.id = id;
        this.nickName = nickName;
        this.level = level;
        this.exp = exp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id <= 0){
            id = 1;
        }else
            this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

//    private void setNikeName(String nickName) {
//        if (nickName == null){
//            nickName = "未知英雄";
//        }else
//            this.nickName = nickName;
//    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1 || level >99){
            this.level = 1;
        }else {
            this.level = level;
        }
    }

    public long getCurrExp() {
        return currExp;
    }

    public void setCurrExp(long currExp) {
        this.currExp = currExp;
    }

    public long getExp() {
        exp =(long)(Math.pow(level-1,3) + 60) / 5 * ((level -1) * 2 + 60);
        return exp;
    }



//    public void setExp(long exp) {
//        this.exp = exp;
//    }
}
