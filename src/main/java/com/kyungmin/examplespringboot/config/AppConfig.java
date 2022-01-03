package com.kyungmin.examplespringboot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix="app")
public class AppConfig {
    private String name; //이름
    private int age; //나이
}
