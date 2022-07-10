package com.company.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(consumerGroup = "MyConsumerGroup", topic = "TestTopic")
@Slf4j
public class RocketMqConsumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        log.info("接收到的消息:"+s);
    }
}
