package org.bhoopendra.learning.client;

import org.bhoopendra.learning.beans.impl.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import java.util.logging.Logger;

/**
 * Created by BHOOPENDRA on 7/24/2017.
 */
public class App {
    public static void main(String[] args) {
        /*BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring_new1.xml"));*/
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_new1.xml");
        Triangle triangle = context.getBean("triangle3", Triangle.class);
        triangle.draw();
        Rectangle rectangle = context.getBean("rectangle",Rectangle.class);
        rectangle.draw();
        Square square = context.getBean("square",Square.class);
        square.draw();
        System.out.println("Ellipse drawing!");
        Ellipse ellipse = context.getBean("ellipse",Ellipse.class);
        ellipse.draw();
        System.out.println("Drawing Hexagone!");
        Hexagon hexagon = context.getBean("hexagone",Hexagon.class);
        hexagon.draw();

    }
}
