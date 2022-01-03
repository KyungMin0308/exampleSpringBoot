package com.kyungmin.examplespringboot.controller;

import com.kyungmin.examplespringboot.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AppConfig appConfig;

    @GetMapping("/")
    public String sayHello(Model model) {

        logger.debug("Name: {}", appConfig.getName());
        logger.debug("Age: {}", appConfig.getAge());

        model.addAttribute("msg", "Spring Boot First App.");

        model.addAttribute("appConfig", appConfig);

        return "index";
    }
}
