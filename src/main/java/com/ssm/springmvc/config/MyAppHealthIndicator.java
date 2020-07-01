package com.ssm.springmvc.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class MyAppHealthIndicator implements HealthIndicator {
    @Override
    public Health getHealth(boolean includeDetails) {
        return Health.down().withDetail("msg","服务启动失败").build();
    }

    @Override
    public Health health() {
        return Health.down().withDetail("msg","服务启动失败").build();
    }
}
