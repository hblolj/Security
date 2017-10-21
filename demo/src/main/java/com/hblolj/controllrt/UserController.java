package com.hblolj.controllrt;

import com.hblolj.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hblolj
 * @Date: Create in 15:29 2017/10/21
 */
@RestController
public class UserController {

    @GetMapping("/user")
    public User query(@RequestParam("userName") String userName, @RequestParam("password") String password){
        return new User(userName, password);
    }

    @GetMapping("/test")
    public String test(){
        int i = 2;
        System.out.println("test");
        return "Test";
    }
}
