package com.suk;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.suk.controller.MessageController;
@SpringBootTest
public class GradleDemoApplicationTest {
    @Autowired
    private MessageController controller;
    @Test
    void contextLoads() {
    }
    @Test
    void testGetMessage() {
        String message = controller.getMessage();
        System.out.println("Message: " + message);
        Assertions.assertNotNull(message);
    }
}
