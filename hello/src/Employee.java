import java.time.LocalDate;

public class Employee {
    /**
     * 雇员姓名
     */
    private String name;
    /**
     * 雇员薪水
     */
    private double salary;
    /**
     * 雇佣日期
     */
    private LocalDate hireDate;







    public void raiseSalary(double byPercent){

        double raise = salary * byPercent / 100;
        this.salary += raise;
    }


    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }



}
