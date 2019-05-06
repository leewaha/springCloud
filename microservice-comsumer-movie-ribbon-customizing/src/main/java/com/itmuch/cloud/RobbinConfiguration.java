package com.itmuch.cloud;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 735 on 2019/5/5.
 */
@Configuration
public class RobbinConfiguration {
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
