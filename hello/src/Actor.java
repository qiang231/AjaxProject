public abstract class Actor {
    private String name;



    public Actor(){}



    public void performs(){
        System.out.println("演员" + name + "正在表演精彩的节目");
    }


    public Actor(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
