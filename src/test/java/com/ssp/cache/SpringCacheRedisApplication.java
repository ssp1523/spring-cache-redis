package com.ssp.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class SpringCacheRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCacheRedisApplication.class, args);
    }
}
