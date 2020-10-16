package cn.ruiyeclub.provider.service;

import cn.ruiyeclub.common.api.HelloService;
import com.alibaba.dubbo.config.annotation.Service;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@DubboService
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String message) {
        return "hello," + message;
    }
}
