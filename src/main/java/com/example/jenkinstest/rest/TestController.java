package com.example.jenkinstest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "/test")
    public String getString() {
        return "test";
    }

    @GetMapping(value = "/test2")
    public String getString2() {
        String s = "";
        // 最长公共子序列
        return "test5";
    }
}
