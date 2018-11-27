package Collection;

import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
        TestCollection t = new TestCollection();
        t.testCollection2();
    }
    public void testCollection2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add("aa");
        coll.add(new Date());
        coll.add("DD");
        Person p =new Person("MM",23);

        coll.add(p);
        System.out.println(coll);
        System.out.println(coll.size());
        //6.contains(Object obj)判断的依据就是根究所在类的equals（）方法
        boolean b = coll.contains(new Person("MM",23));
        System.out.println(b);

        //7.containsAll(Collection coll)判断当前集合中是否包含coll中所有的元素
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(new String("aa"));
        coll1.add(3223);
        boolean b3 = coll.containsAll(coll1);
        System.out.println("b3 = "+ b3);

        //8.retainAll()保留共同的元素,返回给集合
//        coll.retainAll(coll1);
//        System.out.println(coll);

//        coll.removeAll(coll1);
//        System.out.println(coll);


        Collection coll2 = new ArrayList();
        Collection coll3 = new ArrayList();
        coll2.add(111);
        coll2.add("aaa");
        coll3.add(111);
        coll3.add("aaa");

        System.out.println(coll2.equals(coll3));

        //13.toArray():将集合转化为数组
        Object[] obj = coll.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

        //14.iterator():返回一个Iterator接口实现类的对象，进而实现集合的遍历
        //迭代器实现遍历
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println(iterator.hasNext());
        System.out.println(iterator.hashCode());

        String[] strings = new String[]{"111","123","asda","qwedqwdas"};
        for(String s : strings){
            System.out.println(s);
        }
        for (String s: strings
             ) {
            System.out.print(String.join("/","s","sssa","acasda"));
        }



    }



    public void testCollection1(){
        Collection collection = new ArrayList();
        //size();返回集合中对象的个数
        System.out.println(collection.size());

        //2.add(Object obj)

//        ((ArrayList) collection).add(001,"wss");
        collection.add(123);
        collection.add("aa");
        collection.add(new Date());
        collection.add("DD");


        System.out.println(collection.size());

        //3.addAll(Collection coll)
        Collection collection1 = Arrays.asList(1,2,3); // 将数组转化为集合
        collection.addAll(collection1);
        System.out.println(collection.size());

        //4.isEmpty();
        System.out.println(collection1.isEmpty());
        //5.clear();
//        collection.clear();
        System.out.println(collection.isEmpty());

        System.out.println(collection);

    }
}
