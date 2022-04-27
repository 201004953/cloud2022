package com.study.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller01 {
    @Value("${name}")
    private String name;

    @Value("${config.info}")
    private String configInfo;

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String getName() {
        return name;
    }

    @RequestMapping(value = "/config", method = RequestMethod.GET)
    public String configTest01() {
        return configInfo;
    }
}
