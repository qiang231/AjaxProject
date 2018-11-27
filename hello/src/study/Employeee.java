package study;

public abstract class Employeee {
    private String name;
    private int num;
    private MyDate birthday;

    public abstract double earnings();

    public Employeee(String name, int num, MyDate birthday) {
        this.name = name;
        this.num = num;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "name=" + name + '\'' +
                ", num=" + num +
                ", birthday=" + birthday.toDateString() +
                '}';
    }
}
