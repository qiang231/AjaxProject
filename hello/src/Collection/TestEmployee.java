package Collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestEmployee {


    @Test
    public void test2(){
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;

                    MyDate birth1 = e1.getBirthday();
                    MyDate birth2 = e2.getBirthday();
                    if (birth1.getYear() != birth2.getYear()){
                        return birth1.getYear() - birth2.getYear();
                    }else {
                        if (birth1.getMonth() != birth2.getMonth()){
                            return birth1.getMonth() - birth2.getMonth();
                        }else {
                            return birth1.getDay() - birth2.getDay();
                        }
                    }
                }
                return 0;
            }
        };
        TreeSet set = new TreeSet();

        Employee e1 = new Employee("刘德华",23,new MyDate(4,6,1945));
        Employee e2 = new Employee("周杰伦",43,new MyDate(5,9,1944));
        Employee e3 = new Employee("许文强",45,new MyDate(7,8,1944));
        Employee e4 = new Employee("梁朝伟",26,new MyDate(3,5,1944));
        Employee e5 = new Employee("郑智薰",75,new MyDate(4,3,1911));


        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);


        Iterator iterator =set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }


    @Test
    public void test1(){
        Employee e1 = new Employee("刘德华",23,new MyDate(4,12,1923));
        Employee e2 = new Employee("周杰伦",43,new MyDate(5,2,1934));
        Employee e3 = new Employee("许文强",45,new MyDate(7,8,1967));
        Employee e4 = new Employee("梁朝伟",26,new MyDate(3,5,1945));
        Employee e5 = new Employee("郑智薰",75,new MyDate(4,3,1924));
        Employee e6 = new Employee("郑智薰",75,new MyDate(4,3,1924));

        TreeSet set = new TreeSet();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);

        Iterator iterator =set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
