package com.jack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiJiakui
 * @Description:
 * @Dat: Create in 下午4:40 18/4/11
 * @Modifiled By:
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(String name){
        return "hello "+name+", this is provider server";
    }
}
