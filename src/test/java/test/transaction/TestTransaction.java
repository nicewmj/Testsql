package test.transaction;

import cn.xiangqiri.run.RunApplication;
import cn.xiangqiri.run.mapper.UserMapper;
import cn.xiangqiri.run.pojo.User;
import cn.xiangqiri.run.pojo.person;
import cn.xiangqiri.run.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;


@Slf4j
@SpringBootTest(classes = RunApplication.class)
@RunWith(SpringRunner.class)
public class TestTransaction {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testTransaction(){
        Integer a = null;
        try {
            a = userService.update("A", "B", 100);
            System.out.println("转账成功.......");
        } catch (Exception e) {
            System.out.println("转账失败........");
        }
        System.out.println(a);
    }




    @Test
    public void testInsert(){
        //新增
        User user = new User();
        user.setName("我民");
        user.setAddress("紫禁城");
        user.setBirthday(new Date());

        Integer integer = userMapper.insertUser(user);
        System.out.println("新增成功s----"+ integer);
    }
    @Test
    public void testdelete(){
        //删除
        Integer integer = userMapper.deleteUser(3);
        System.out.println("删除成功------"+ integer);
    }

    @Test
    public void testupdate(){
        // 更新
        User user = new User();
        user.setName("人民");
        user.setAddress("汉宫");
        user.setBirthday(new Date());
        user.setId(4);
        Integer integer = userMapper.updateUser(user);
        System.out.println("更新成功------"+ integer);
    }

    @Test
    public void testselect(){
        // 查询
//        List<User> users = userMapper.selectUser();
//        for(User u : users){
//            Integer id = u.getId();
//            String address = u.getAddress();
//            Date birthday = u.getBirthday();
//            String name = u.getName();
//            System.out.println("id = "+id+" name="+name+" birthday ="+birthday+" address= "+address);
//        }
//        System.out.println("查询成功------"+ users);
    }

    @Test
    public void testselectList(){
        // List查询
        User user = new User();
        user.setName("我是list");
        user.setAddress("大唐");
        user.setBirthday(new Date());
        user.setId(1);
        user.setStatus("生效");
        List<User> list = new ArrayList();
        list.add(user);
        List<User> users = userMapper.selectUser(list);
        System.out.println("查询成功------"+ users);
    }


    @Test
    public void testselectInteger(){
        // List《Integer》查询

        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(4);
//        List<User> users = userMapper.selectUserInteger(list);
//        System.out.println("查询成功------"+ users);
    }

    @Test
    public void testselectMap(){
        //Map 查询数据
        Map<String,person> resultMap = userMapper.getResultMap();
        System.out.println("查询成功------"+ resultMap);
    }

}
