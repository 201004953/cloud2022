package com.study.spring.controller;

import com.study.spring.domain.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Controller02 {
    @Autowired
    private Config config;

    @GetMapping("/config02")
    public String getInfo() {
        return config.getInfo();
    }
}
