package study;

public class SalaryedEmployee extends Employeee{

    private double monthlySalary;

    public SalaryedEmployee (String name, int num, MyDate birthday, double monthlySalary) {
        super(name,num,birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalaryedEmployee{" + super.toString()+
                "monthlySalary=" + monthlySalary +
                '}';
    }
}
