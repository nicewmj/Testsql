package cn.xiangqiri.run.service;

import cn.xiangqiri.run.pojo.User;

import java.util.List;

public interface UserService {

    public List<User> find();
    public User get(Integer id);

    Integer update(String fromName,String toName,Integer money);

}
