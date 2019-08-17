package cn.xiangqiri.run.mapper;

import cn.xiangqiri.run.pojo.Money;
import cn.xiangqiri.run.pojo.User;
import cn.xiangqiri.run.pojo.person;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //调用xml方式
     List<User> find();

    //调用注解方式
    @Select("select * from user where id=#{id}")
     User get(@Param("id") Integer id);
    //测试事务
    Integer update(@Param("name") String name,@Param("money") Integer money);

    Money getMoney(@Param("name") String name);


    //测试数据库的增删改查

     Integer insertUser(@Param("user") User user);

    @MapKey("id")//指定map的key为表字段的id值
    Map<String,person> getResultMap();

     Integer deleteUser(@Param("id") Integer id);

     Integer updateUser(@Param("user") User user);

     List<User> selectUser(@Param("user") List<User> user);

    List<User> selectUsrInteger(@Param("list") List<Integer> list);
}
