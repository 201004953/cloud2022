package com.study.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication8001.class, args);
    }
}
