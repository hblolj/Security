package com.hblolj.controllrt;

import com.hblolj.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hblolj
 * @Date: Create in 15:29 2017/10/21
 */
@RestController
public class UserController {

    @GetMapping("/user")
    public List<User> query(User user){
        System.out.println(user.toString());
        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }

    @GetMapping("/test")
    public String test(){
        int i = 2;
        System.out.println("test");
        return "Test";
    }
}
