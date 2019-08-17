package cn.xiangqiri.run.hello;

import cn.xiangqiri.run.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String say(){
        return "hello  大帅哥";
    }

    @RequestMapping("helloe/{name}")
    public String sayNo(@PathVariable String name ){
        return "大帅哥说 "+name+"好帅";
    }


    @RequestMapping("/testTra")
    public String testTra(@PathVariable String name,@PathVariable Integer money){



        return  null;
    }

    }
