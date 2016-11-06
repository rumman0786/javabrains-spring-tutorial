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
        System.out.println("================");
        triangle.draw();
        Point point = new Point();
        point.setX(222);
        point.setY(444);
        triangle.getPoints().add(point);
        System.out.println("================");
        triangle.draw();

        System.out.println("================");
        // No new object created returned prev trianle as scope is not defined and default singleton scope is used
        Triangle triangle2 = (Triangle) context.getBean("triangle");
        triangle2.draw();
    }
}
