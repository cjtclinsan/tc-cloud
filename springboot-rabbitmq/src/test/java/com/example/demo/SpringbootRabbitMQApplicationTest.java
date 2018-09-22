package com.example.demo;

import com.example.sbmp.SpringbootRabbitMQApplication;
import com.example.sbmp.service.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @email wangiegie@gmail.com
 * @data 2017-09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootRabbitMQApplication.class)
public class SpringbootRabbitMQApplicationTest {
    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception {
        for (int i = 0; i < 1000; i++) {
            sender.send();
        }
    }
}