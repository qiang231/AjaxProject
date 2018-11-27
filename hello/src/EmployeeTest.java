import javax.swing.*;

/**
 * 测试
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] staff = new Employee[3];
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] == null){
                staff[i] = new Employee();
            }
            String name = JOptionPane.showInputDialog("请输入员工姓名：");
            staff[i].setName(name);

            String strSalary = JOptionPane.showInputDialog("请输入员工薪水：");
            staff[i].setSalary(Double.parseDouble(strSalary));

//            String strDate = JOptionPane.showInputDialog("请输入雇佣日期：");
//            staff[i].setHireDate(LocalDate.of(strDate));
        }
            for (Employee e :staff
                 ) {
                e.raiseSalary(5);
            }
            for (Employee e : staff
                 ) {
                JOptionPane.showMessageDialog(null,"name=" + e.getName() + ",salary=" + e.getSalary());
                System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
            }



    }





}
