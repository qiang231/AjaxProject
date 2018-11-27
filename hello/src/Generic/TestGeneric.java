package Generic;

import org.junit.Test;

import java.util.*;

public class TestGeneric{

    //通配符？

    @Test
    public void test6(){
        List<?> list = null;
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list = list1;
        list = list2;

        List<? super Number> list3 = null;
        List<Integer> list4 = null;
//        list3 = list4;
        list3 = list1;

    }




    //泛型与继承的关系
    @Test
    public void test5(){
        Object obj = null;
        String str = "AA";
        obj = str;

        Object[] objects = null;
        String[] strings = new String[]{"AA","BB","CC"};
        objects = strings;


        List<Object> list = null;
        List<String> list1 = new ArrayList<>();
//        list = list1;


    }


    //自定义泛型类的使用
    @Test
    public void test4(){
        Order<Boolean> order = new Order<>();
        order.setT(true);
        System.out.println(order.getT());
        order.add();
        System.out.println(order.list);

        //当通过队形调泛型方法时，指明泛型方法的类型
        Integer i = order.getE(34);
        Double d = order.getE(2.4);

        Integer[] integers = new Integer[]{1,2,3};
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = order.fromArrayToList(integers,list);
        System.out.println(list1);

    }

    @Test
    public void test3(){
        Map<String,Integer> map =new HashMap<>();
        map.put("AA",12);
        map.put("12",12);
        map.put("DD",23);

        Set set = map.entrySet();
        for (Object obj:set
             ) {
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey()+ "---->" + entry.getValue());
        }
        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        for (Map.Entry o:entry
             ) {
            System.out.println(o.getKey() + "---->" + o.getValue());
        }

    }

    @Test
    public void test2(){
        List<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(98);
        list.add(86);

        for (Integer aList : list) {
            System.out.println(aList);
        }

    }


    //1.在集合中没有使用泛型的情况下,任何Object及其子类的对象都可以添加进来(类型不安全)
        //强制转化类型时，可能会报ClassCastException的异常
//
//    @Test
//    public void test1(){
//        List list =new ArrayList();
//        list.add(89);
//        list.add(87);
//        list.add(67);
//        list.add(new String("AA"));
//        for (int i = 0; i <list.size() ; i++) {
//            int score = (Integer)list.get(i);
//            System.out.println(score);
//        }
//    }
}
