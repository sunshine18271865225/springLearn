package com.ssyl;

import com.ssyl.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sz
 * @Classname ${NAME}
 * @Description TODO
 * @Date 2026/4/27 20:12
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(classPathXmlApplicationContext.getClass().getName());
        UserService userService = classPathXmlApplicationContext.getBean(UserService.class);
        userService.add();

    }
}