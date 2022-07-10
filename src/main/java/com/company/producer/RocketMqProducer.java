package com.company.producer;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RocketMqProducer {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    public void sendMessage(String topic,String msg){
        rocketMQTemplate.convertAndSend(topic,msg);
    }
}
