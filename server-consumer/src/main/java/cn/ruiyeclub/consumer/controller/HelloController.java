package cn.ruiyeclub.consumer.controller;

import cn.ruiyeclub.common.api.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference
    HelloService helloService;

    @GetMapping("/hello/{message}")
    public String hello(@PathVariable String message) {
        return this.helloService.hello(message);
    }
}
