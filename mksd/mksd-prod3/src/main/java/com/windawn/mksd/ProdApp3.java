package com.windawn.mksd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.windawn.mksd.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
public class ProdApp3 {

    public static void main(String[] args) {
        SpringApplication.run(ProdApp3.class,args);
    }
}
