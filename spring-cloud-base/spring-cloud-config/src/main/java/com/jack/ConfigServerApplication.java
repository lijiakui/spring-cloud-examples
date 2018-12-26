package com.jack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: LiJiakui
 * @Description:
 * @Dat: Create in 下午7:32 18/4/19
 * @Modifiled By:
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApplication {

    public static void main(String[] args) {
        /**
         * sdjfsjdfcccccl
         */
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
