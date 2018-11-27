package Collection;

import org.junit.Test;

import java.util.*;

/**
 * 1.无序性不等于随机性，真正的无序性指的是元素在底层存储的位置是无序的
 * 2.不可重复性：当想Set中添加相同的元素的时候，后面的这个元素添加不进去,
 *
 * 说明：所在类重写equals方法和hashCode方法，进而保证不可重复性
 *
 * set中元素存储的方法？哈希算法
 *
 *
 */
public class TestSet {

    @Test
    public void testTreeSet(){

        //1.创建一个实现了Comparator接口的类对象
        Comparator com = new Comparator() {
            //向TreeSet中添加Customer类的对象，
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Customer && o2 instanceof Customer){
                    Customer c1 = (Customer)o1;
                    Customer c2 = (Customer)o2;
                    int i = c1.getId().compareTo(c2.getId());
                    if (i == 0){
                        return c1.getName().compareTo(c2.getName());
                    }else return i;
                }
                return 0;
            }
        };
        TreeSet<Customer> set = new TreeSet<Customer>(com);
//        Set set = new TreeSet();
//        set.add("AAAA");
//        set.add("sadsad");
//        set.add(new String("AA"));
//        set.add(new String("BB"));
//        set.add("sdsdwqwqd");
//        set.add("AA");
        set.add(new Customer("FF",23));
        set.add(new Customer("SS",21));
        set.add(new Customer("QW",24));
        set.add(new Customer("RE",24));
        set.add(new Customer("GD",27));
        set.add(new Customer("GD",28));

        for (Object obj:set
             ) {
            System.out.println(obj);
        }
    }


    @Test
    public void testLinkedHashSet(){
        Set<String> set = new LinkedHashSet<>();
        set.add("SSS");
        set.add("WQW");
        set.add("AA");
        set.add("BB");
        set.add(null);

        System.out.println(set);
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    @Test
    public void testHashSet(){
        Set<Integer> set = new HashSet<>();
        set.add(123);
        set.add(456);
        set.add(3242);
        set.add(34);
        set.add(null);
        set.add(231);

////        Person p1 = new Person("GG",23);
////        Person p2 = new Person("GG",23);
//        System.out.println(p1.equals(p2));
//        set.add(p1);
//        set.add(p2);

        System.out.println(set.size());
        System.out.println(set);

    }

}
