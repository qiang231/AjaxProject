package EmployeeAndManage;

import java.time.LocalDate;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;


    public Employee(String name,double salary, int year, int month, int day){
        this.name = name;
        this.salary =salary;
        hireDay = LocalDate.of(year, month, day);
    }

    /**
     * 涨工资了
     * @param byPercent
     */
    public  void raiseSalsry(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }
}
