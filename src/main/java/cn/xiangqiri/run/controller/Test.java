package cn.xiangqiri.run.controller;

import cn.xiangqiri.run.pojo.Apply;
import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import sun.rmi.transport.Connection;

import java.util.*;
import java.util.stream.Stream;

public class Test {


    public static void main(String[] args) {

//流读取数据
//        Apply a = new Apply();
//        a.setWindet(12);
//        a.setWindet(3);
//        a.setWindet(5);
//        a.setWindet(63);
//        a.setWindet(16);
//        List<Apply> list = new ArrayList<Apply>();
//        list.add(new Apply("red",1));
//        list.add(new Apply("back",12));
//        list.add(new Apply("greed",45));
//        list.add(new Apply("bule",241));
//        list.add(new Apply("pink",24));
//        Collections.sort(list, (o1, o2) -> {
//            int i = o1.getWindet()-o2.getWindet();
//            if(i>0){
//                return 1;
//            }else if(i<0){
//                return -1;
//            }else {
//                return 0;
//            }
//        });
//        System.out.println(list.toString());
//
//        list.stream().filter(a -> a.getColor().equals("red"))
//                .sorted(Comparator.comparingInt(Apply::getWindet))
//                .forEach(System.out::println);


    //遍历map
        //HashMap 底层是哈希表数据结构，线程是不同步的，
        // 可以存入null键，null值。要保证键的唯一性，需要覆盖hashCode方法，和equals方法。
        //HashMap 是无序的，LinkedHashMap 是有序的 会按照你put进去的顺序来排序好你的map
//        Map<Integer,String> map = new HashMap();
//        Map<Integer,String> map = new LinkedHashMap<>();
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(7,"serven");
        map.put(10,"one");
        map.put(5,"fix");
        map.put(2,"two");
        map.put(4,"four");
        map.put(3,"three");
        map.put(6,"six");

        System.out.println(map);

        //Set 不能重复
        Set<Integer> set = new HashSet<>();
        set.add(7);
        set.add(10);
        set.add(2);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(6);
        System.out.println(set);

       /* //第一种方法 可以拿到key value
        for (Map.Entry<Integer,String> map1 :map.entrySet()){
            Integer key = map1.getKey();
            String value = map1.getValue();
            System.out.println("key :"+key+"  value :"+value);
        }
        //试一下用流遍历 获取所有的key
        map.keySet().stream().forEach(a-> System.out.println(a));
        //用流遍历 获取所有的key，value
        map.entrySet().stream().forEach(a ->{
            System.out.println( "key :"+a.getKey());
            System.out.println( "value :"+a.getValue());
        } );
*/

        //for遍历所有的key
       /* for(Integer integer :map.keySet()){
            System.out.println(integer);
        }*/

       /* for(Object value : map.keySet()){
            System.out.println("key: "+ value+" value: "+map.get(value));
        }*/

       //JDK1.4中的 iterator
     /*   Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println("key: "+next.getKey());;
            System.out.println("value: "+next.getValue());;
        }*/


     //遍历map<string,ArrayList>
        System.out.println("遍历map<string,ArrayList> ");

        List<Apply> list = new ArrayList<Apply>();
        list.add(new Apply("red",1));
        list.add(new Apply("back",12));
        list.add(new Apply("greed",45));
        list.add(new Apply("bule",241));
        list.add(new Apply("pink",24));

         Map<Integer,List> maplist =new HashMap<>();
         maplist.put(1,list);
         //通过key获取value的形式获取到list 在遍历list
        /*Iterator<Integer> iterator = maplist.keySet().iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            List list1 = maplist.get(next);
            for (Object o :list1){
                System.out.println("list: "+o);
            }
        }*/

        for(Map.Entry<Integer,List> map2 : maplist.entrySet()){
            System.out.println("key: "+map2.getKey());
            System.out.println("value: "+map2.getValue());
            map2.getValue().stream().forEach(a -> System.out.println());
        }


    }
}
