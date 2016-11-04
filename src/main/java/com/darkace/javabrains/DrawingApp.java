package com.darkace.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by rumman on 11/5/16.
 */
public class DrawingApp {
    public static void main(String[] args) {
//        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();

        Triangle triangle2 = (Triangle) context.getBean("triangle2");
        triangle2.draw();

        Triangle triangle3 = (Triangle) context.getBean("triangle3");
        triangle3.draw();
    }
}
