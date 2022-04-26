package com.study.spring.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigTestController {
    @Value("${config.info: default}")
    public String configInfo;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String configTest01() {
        return configInfo;
    }
}
