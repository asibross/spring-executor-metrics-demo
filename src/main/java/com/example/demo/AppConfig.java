package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.concurrent.Executor;

@Configuration
public class AppConfig {

    @Bean
    @Lazy
    public Executor myLazyExecutor() {
        throw new RuntimeException("I am lazy, don't create me unless I am needed!");
    }
}
