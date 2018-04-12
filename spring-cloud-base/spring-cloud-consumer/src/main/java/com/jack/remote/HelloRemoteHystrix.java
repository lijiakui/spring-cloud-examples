package com.jack.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: LiJiakui
 * @Description:
 * @Dat: Create in 下午5:39 18/4/11
 * @Modifiled By:
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello "+name+", provider error";
    }
}
