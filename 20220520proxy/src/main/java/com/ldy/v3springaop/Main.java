package com.ldy.v3springaop;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Tank tank = (Tank)context.getBean("tank");
        tank.move();
    }
}
