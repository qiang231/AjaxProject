package Collection;

import org.junit.Test;

import java.util.*;

public class TestCollections {

    @Test
    public void test2() {
        List list = new ArrayList();
        list.add(123);
        list.add(433);
        list.add(54);
        list.add(179);
        list.add(123);
        list.add(123);
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list,123));

//        List list1 =new ArrayList();
        List list1 = Arrays.asList(new Object[list.size()]);
        Collections.copy(list1,list);
        System.out.println(list1);

        //list2是线程安全
        List list2 = Collections.synchronizedList(list);

    }


    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(433);
        list.add(54);
        list.add(179);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.swap(list,0,3);
        System.out.println(list);
    }
}
