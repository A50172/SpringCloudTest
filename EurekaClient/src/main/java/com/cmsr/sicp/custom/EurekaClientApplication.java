package com.cmsr.sicp.custom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * created by 巩尊豪 2020/7/21
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.cmsr.sicp.custom.mapper")
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class,args);
    }
}
