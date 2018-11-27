package Collection;

import java.util.Objects;

public class Employee1 {
    private String name;
    private int age;
    private MyDate birthday;

    public Employee1() {
    }

    public Employee1(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return age == employee1.age &&
                Objects.equals(name, employee1.name) &&
                Objects.equals(birthday, employee1.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }


}
