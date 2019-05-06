package com.itmuch.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 735 on 2019/5/5.
 */
@FeignClient(name="microservice-provider-user")
public interface UserFeignClient {
    @RequestMapping(value = "/{id}",method= RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
}
