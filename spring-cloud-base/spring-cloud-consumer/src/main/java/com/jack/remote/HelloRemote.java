package com.jack.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: LiJiakui
 * @Description: 远程调用
 * @Dat: Create in 下午4:54 18/4/11
 * @Modifiled By:
 */
@FeignClient(name = "SPRING-CLOUD-PROVIDER", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    /**
     * 发送远程请求
     * @param name
     * @return
     */
    @RequestMapping("hello")
    String hello(@RequestParam("name") String name);
}
