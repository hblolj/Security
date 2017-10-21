package com.hblolj.controllrt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hblolj
 * @Date: Create in 14:37 2017/10/21
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
