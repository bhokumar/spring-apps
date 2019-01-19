package org.school.spring.learning;

import org.school.spring.bean.Circle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryLearning {

	public static void main(String[] args) {
		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		context.registerShutdownHook();
		/*
		 * Triangle triangle=(Triangle)context.getBean("triangle1");
		 * triangle.draw();
		 */
		Circle circle = (Circle) context.getBean("circle");
		System.out.println(circle);
		circle.draw();
		System.out.println(context.getMessage("greeting", null,
				"Default Greeting", null));
	}

}
