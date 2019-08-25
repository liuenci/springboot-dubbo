package com.liuencier.springboot.dubbo.provider.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.liuencier.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = ServiceAPI.class)
public class QuickStartServiceImpl implements ServiceAPI {
    @Override
    public String sendMessage(String message) {
        return "quickstart-provider-message="+message;
    }
}
