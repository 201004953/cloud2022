package com.study.spring.controller;

import com.study.spring.domain.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controller01 {
    @Autowired
    private People people;

    @Value("${people.id}")
    private String id;

    @Value("${people.age}")
    private Integer age;

    @Value("${local.fileName}")
    private String localFileName;

    @GetMapping("/people01")
    public People getPeople01() {
        return people;
    }

    @GetMapping("/id")
    public String getId() {
        return id;
    }

    @GetMapping("/age")
    public Integer getAge() {
        return age;
    }

    @GetMapping("/file")
    public String getLocalFileName() {
        return localFileName;
    }
}
