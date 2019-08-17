package cn.xiangqiri.run.service.impl;

import cn.xiangqiri.run.mapper.UserMapper;
import cn.xiangqiri.run.pojo.Money;
import cn.xiangqiri.run.pojo.User;
import cn.xiangqiri.run.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {



    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> find() {
        return userMapper.find();
    }

    @Override
    public User get(Integer id) {
        return userMapper.get(id);
    }

    /**
     * 测试事务
     * @param fromName 从哪里转
     * @param toName 转到哪里
     * @param money 转多少钱
     * @return
     */
    @Transactional
    @Override
    public Integer update(String fromName, String toName, Integer money) {

        //先获取转账对象的信息
        Money money1 = userMapper.getMoney(fromName);
        Money money2 = userMapper.getMoney(toName);
        //然后第一个进行转账，更新数据库
        int from =money1.getMoney()-money;
        Integer s = userMapper.update(fromName, from);

        //设置一个异常 让事务回滚
        int i = 1/0;
        //第二个转账
       int to = money2.getMoney()+money;
       userMapper.update(toName,to);

        return s;
    }
}
