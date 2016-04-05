package com.kms.launch.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HomeController {

    @Value("${app.name}")
    private String appName;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!" + appName;
    }
}