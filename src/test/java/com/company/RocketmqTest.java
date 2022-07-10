package com.company;

import com.company.producer.RocketMqProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RocketmqTest {

    @Resource
    private RocketMqProducer rocketMqProducer;

    @Test
    public void test(){
        rocketMqProducer.sendMessage("TestTopic", "hello,mq");
    }
}
