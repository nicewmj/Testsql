package cn.xiangqiri.run.controller;

import java.sql.SQLOutput;

/**
 * 枚举类
 * 1：
 */
public class Testeume1 {

    public static void main(String[] args) {
        Season name = Season.SORING;
        System.out.println(name);
        name.show();
        System.out.println(name.getSeasonName());
        System.out.println("---------------------------------------------");

        //常用方法 value 获取所有的value值 返回一个数组
        Season1[] values = Season1.values();
        for (int i =0;i<values.length;i++){
            System.out.println(values[i]);
        }
        //常用方法 valueOf(String name) 传入一个enum 字符串 返回这个enum的值
        String name1 = "SUNMER";
        Season1 season1 = Season1.valueOf(name1);
        System.out.println(season1);

        //调用重写过的show方法
        System.out.println("________调用重写过的show方法_____________");
       Season1 name2 = Season1.WINTER;
       name2.show();
    }
}

//写一个接口 info 方法show 可以让枚举类实现接口，当我调用不同的枚举的时候做不同的事情
interface info{
    void show();
}

//枚举类
enum  Season1 implements info{
    //创建枚举类的对象 只能通过类来调用 就是static 不能修改 final
   SORING("spring","风一样的女子"){
       public void show(){
           System.out.println("风一样的女子 疯了");
       }
    },
   SUNMER("spring","风一样的男子"){
       public void show(){
           System.out.println("风一样的男子 疯了");
       }
   },
   AUTUM("spring","风一样的汉子"){
       public void show(){
           System.out.println("风一样的汉子 疯了");
       }
   },
    WINTER ("spring","风一样的票子"){
        public void show(){
            System.out.println("风一样的票子 疯了");
        }
    };


    //1 提供类的属性 声明为 private
    private final String seasonName;
    private final String seasonDesc;

    //2 声明为final属性再构造器中初始化
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3 通过共用的方法来调用属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    public void show(){
        System.out.println("this is 季节");
    }
}
