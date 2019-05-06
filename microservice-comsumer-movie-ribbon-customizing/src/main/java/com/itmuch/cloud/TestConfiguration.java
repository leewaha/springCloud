package com.itmuch.cloud;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 735 on 2019/5/5.
 */
@Configuration
@RibbonClient(name="microservice-provider-user",configuration = RobbinConfiguration.class)
public class TestConfiguration {
}
