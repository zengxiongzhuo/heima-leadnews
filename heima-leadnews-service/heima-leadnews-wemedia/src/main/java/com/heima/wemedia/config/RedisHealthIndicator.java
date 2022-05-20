package com.heima.wemedia.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisHealthIndicator implements HealthIndicator {


    @Override
    public Health health() {
        return Health.up().build();
    }
}