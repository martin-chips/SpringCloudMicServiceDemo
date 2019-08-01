package com.dimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @className: EurekaServer7001_App
 * @description:
 * @auther: Dimple
 * @date: 08/01/19
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer//Eureka服务端启动类，表示接受其他微服务注册进来
public class EurekaServer7002_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class, args);
    }
}
