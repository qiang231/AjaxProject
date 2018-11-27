package EmployeeAndManage;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("wss",80000,1999,12,1);
        manager.setBonus(5000);

        Employee[] employee = new Employee[3];
        employee[0] = manager;
        employee[1] = new Employee("mayun",21111,2001,2,3);
        employee[2] = new Employee("dasdsada",21351,2001,2,3);

        for (Employee e:employee
             ) {
            System.out.println("name = " + e.getName() + "\t" + e.getSalary());
        }

//        Manager manager = new Manager();
//        employee.setName("马云");
//        employee.setSalary(10000);
//        manager.setBonus(5000);
        System.out.println(manager.getName() + "的最后工资为：" + manager.getSalary());
    }

}
