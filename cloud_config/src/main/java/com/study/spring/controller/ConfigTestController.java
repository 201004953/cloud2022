//package com.study.spring.controller;
//
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ConfigTestController {
//    @Value("${config.info}")
//    private String configInfo;
//
//    @Value("${name}")
//    private String name;
//
//    @RequestMapping(value = "/config", method = RequestMethod.GET)
//    public String configTest01() {
//        return configInfo;
//    }
//
//    @RequestMapping(value = "/name", method = RequestMethod.GET)
//    public String getName() {
//        return name;
//    }
//}
