package Collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        TestList testList =new TestList();
        testList.testList1();

    }



    public void testList1(){
        //list中相对于Collection增加的方法
        List list =new ArrayList();
        list.add(123);
        list.add(456);
        list.add(new String("aaa"));
        list.add(new String("bbb"));

        list.add(0,"21312");

        System.out.println(list.get(4));

//        list.remove(1);
        list.set(0,231);
        System.out.println(list.subList(1,3));

        System.out.println(list);








    }
}
