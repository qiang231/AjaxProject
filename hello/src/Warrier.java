public class Warrier extends Hero1 {


    private int pysicalAttack; //战士特有属性物理攻击


    /**
     * 重写父类的move方法
     */
    public void move(){
        System.out.println(getNiceName() + "：移动基本靠走");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return getNiceName() + "\t" + getPysicalAttack();
    }

    public Warrier(){
        super();  //默认调用父类构造函数
        System.out.println("子类默认构造！");
    }

    public Warrier(String nickName, int pysicalAttack){
        setNiceName(nickName);
        setPysicalAttack(pysicalAttack);
    }



    public int getPysicalAttack() {
        return pysicalAttack;
    }

    public void setPysicalAttack(int pysicalAttack) {
        this.pysicalAttack = pysicalAttack;
    }
}
