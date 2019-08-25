package com.liuencier.springboot.dubbo.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;

import com.liuencier.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
public class QuickStartConsumer {
    @Reference(url = "dubbo://localhost:20880")
    ServiceAPI serviceAPI;

    public void sendMessage(String message) {
        System.out.println(serviceAPI.sendMessage(message));
    }
}
