package com.windawn.mksd.action;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.windawn.mksd.vo.Users;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UsersCtrl {

    @RequestMapping("/get/{name}")
    @HystrixCommand
    public Object get(@PathVariable("name")String name) {
        Users users = new Users();
        users.setUserName(name);
        users.setBirthday(new Date());
        users.setEmail("voidwhile@aliyun.com");
        users.setGender("M");
        users.setRealName("voidwhile");
        return users;
    }
}
