package cn.xiangqiri.run.controller;

import cn.xiangqiri.run.pojo.person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {

    //list.stream().map().collect(Collectors.toList());遍历，有返回值，而list.stream().forEach() 没有返回值
    public static void main(String[] args) {

        List<person> list = new ArrayList();
        list.add(new person(12,"xiaoming"));
        list.add(new person(13,"jin"));
        list.add(new person(14,"chu"));

        list=  list.stream().map(a->new person(a.getId(),a.getName())).collect(Collectors.toList());
        list.stream().forEach(a-> System.out.println("forEach 遍历没有返回值"));
        System.out.println(list);


        List<String> list1 = new ArrayList();
        List<String> list2 = new ArrayList();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        System.out.println("开始lits1 为 ："+list1);
        System.out.println("开始lits2 为 ："+list2);
        list2 =  list1.stream().map(string -> {
            return "stream().map()处理之后： "+string;
        }).collect(Collectors.toList());

        list2.stream().forEach(a -> System.out.println("处理之后list2为 ："+ a));

    }

}
