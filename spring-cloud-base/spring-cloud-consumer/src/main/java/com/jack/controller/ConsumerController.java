package com.jack.controller;

import com.jack.remote.HelloRemote;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: LiJiakui
 * @Description:
 * @Dat: Create in 下午4:48 18/4/11
 * @Modifiled By:
 */
@RestController
public class ConsumerController {

    @Resource
    private HelloRemote helloRemote;

    /**
     * say hello
     * @return
     */
    @RequestMapping("hello")
    public String hello(){
        String message = helloRemote.hello("consumer-server");
        return message;
    }
}
