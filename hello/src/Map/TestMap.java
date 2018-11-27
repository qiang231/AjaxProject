package Map;

import Collection.Person;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class TestMap {


    @Test
    public void test6(){
        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream(new File("src/Map/jdbc.properties")));
            System.out.println(pro.getProperty("user"));
            System.out.println(pro.getProperty("password"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //定制排序
    @Test
    public void test5(){
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person){
                    Person p1 =(Person)o1;
                    Person p2 =(Person)o2;
                    int i = p1.getAge().compareTo(p2.getAge());
                    if (i == 0){
                        return p1.getName().compareTo(p2.getName());
                    }
                    return i;
                }
                return 0;
            }
        };
        TreeMap map = new TreeMap(com);
        map.put(new Person("AA",23),89);
        map.put(new Person("BB",34),34);
        map.put(new Person("CC",22),28);
        map.put(new Person("XX",23),98);
        map.put(new Person("DD",25),77);

        Set set = map.keySet();
        for (Object obj:set
             ) {
            System.out.println(obj + "---->" + map.get(obj));
        }
    }

    //TreeMap 按照添加进Map中的指定key属性进行排序
    @Test
    public void test4(){
        Map map = new TreeMap();
        map.put(new Person("AA",23),89);
        map.put(new Person("BB",34),34);
        map.put(new Person("CC",22),28);
        map.put(new Person("XX",23),98);
        map.put(new Person("DD",25),77);

        Set set = map.entrySet();
        for (Object obj:set
             ) {
            Map.Entry entry =(Map.Entry)obj;
            System.out.println(entry.getKey() +"---->" + entry.getValue());
        }
    }






    @Test
    public void test3(){
        Map map = new LinkedHashMap();
        map.put("AA",123);
        map.put("BB",2313);
        map.put(new Person("GG",34),564);

        //遍历key值
        Set set =map.keySet();
        for (Object obj:set
             ) {
            System.out.println(obj);
        }

        //遍历values值

        Collection values = map.values();
        Iterator iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //遍历key-values对
            //方式一：
        Set set1 = map.keySet();
        for (Object obj:set1
             ) {
            System.out.println(obj + "---->" + map.get(obj));
        }

        //方式二：
        Set set2 =map.entrySet();
        for (Object obj:set2
             ) {
            Map.Entry entry =(Map.Entry)obj;
            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }


    }


    /**
     * 如何遍历Map
     *
     */
    @Test
    public void test2(){
        Map map =new HashMap();

        map.put("AA",231);
        map.put("BB",223);
        map.put("AA",23);
        map.put("CC",243);
        map.put(123,"DD");
        map.put(null,null);
        map.put(new Person("GG",23),87);


        //1.如何遍历key集
        Set set =map.keySet();
        for (Object obj:set
             ) {
            System.out.println(obj);
        }
        //2.遍历value集
        Collection values = map.values();
        Iterator iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //3.遍历key-values对
        //方式一：
        Set set1 = map.keySet();
        for (Object obj:set1
             ) {
            System.out.println(obj + "------>" + map.get(obj));
        }
        //方式二：
        Set set2 =map.entrySet();
        for (Object obj:set2
             ) {
            Map.Entry entry =(Map.Entry)obj;
            System.out.println(entry.getKey() + "------>" + entry.getValue());
        }

    }





        public static void main(String[] args) {
            //存储数据map
            HashMap date = new HashMap();
            date.put("d1","I like to watch the sun set with my friend.");
            date.put("d2","The Best Places To Watch The SunSet. ");
            date.put("d3","My friend watch the sun come up.");
            //索引的map
            HashMap index = new HashMap();
            Set keySet = date.keySet();
            //遍历date的key
            for (Object word:keySet) {
                String keyString = (String) word;
                //通过key获得value
                String count = (String) date.get(keyString);
                //将字符串分割成数组
                String[] words = count.split(" ");
                //遍历数组，获取关键字
                for (int i = 0; i <words.length ; i++) {
                    //判断索引中是否存在关键字，如果不存在添加，存在将追加
                    if (!index.containsKey(words[i])){
                        //创建一个arrylist用来添加或后续追加索引值
                        ArrayList books = new ArrayList();
                        //将date的key存入
                        books.add(keyString);
                        //将新组建的键值对存入索引
                        index.put(words[i],books);
                    }
                    else {
                        //如果存在关键字,通过关键字获取value，
                        List books = (List) index.get(words[i]);
                        books.add(keyString);

                    }
                }
            }
            //输出新map
            System.out.println(index);

        }


    }

