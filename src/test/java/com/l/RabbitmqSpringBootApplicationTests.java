package com.l;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqSpringBootApplicationTests {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    void contextLoads() {
    }

}
