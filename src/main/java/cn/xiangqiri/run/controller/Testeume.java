package cn.xiangqiri.run.controller;

public class Testeume {

    public static void main(String[] args) {
        Season name = Season.SORING;
        System.out.println(name);
        name.show();
        System.out.println(name.getSeasonName());
    }
}

//枚举类
class Season{

    //1 提供类的属性 声明为 private
    private final String seasonName;
    private final String seasonDesc;

    //2 声明为final属性再构造器中初始化
    private Season(String seasonName, String seasonDesc) {
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

    //创建枚举类的对象 只能通过类来调用 就是static 不能修改 final
    public static final Season SORING = new Season("spring","风一样的女子");
    public static final Season SUNMER = new Season("spring","风一样的男子");
    public static final Season AUTUM = new Season("spring","风一样的汉子");
    public static final Season WINTER = new Season("spring","风一样的票子");

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
