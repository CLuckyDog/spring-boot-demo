package com.rh.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/7/28.
 */
@RestController
public class HelloController {

    @RequestMapping("/say")
    public String hello(){
        return "hello world!";
    }
}
