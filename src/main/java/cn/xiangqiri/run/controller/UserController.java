package cn.xiangqiri.run.controller;


import cn.xiangqiri.run.pojo.User;
import cn.xiangqiri.run.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/find")
    public List<User> find(){
        return userService.find();
    }

    @RequestMapping("/get/{id}")
    @Transactional
    public User get(@PathVariable Integer id){
        return userService.get(id);
    }


}
