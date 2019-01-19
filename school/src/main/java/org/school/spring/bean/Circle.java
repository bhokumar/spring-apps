package org.school.spring.bean;

import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
//@Component
//@Service
//@Repository

@Controller
public class Circle implements ApplicationEventPublisherAware {
	private Point center;
	private int radious;
	private ApplicationEventPublisher publisher;
	@Autowired
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name = "center")
	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadious() {
		return radious;
	}

	public void setRadious(int radious) {
		this.radious = radious;
	}

	@Override
	public String toString() {
		return this.messageSource.getMessage("circle.drawing", null,
				"Default Message", new Locale("EN"))
				+ this.messageSource.getMessage("circle.center", new Object[] {
						center.getX(), center.getY() },
						"Default printing Point", new Locale("EN"));
	}

	@PostConstruct
	public void initialize() {
		System.out.println("Initialize");
	}

	@PreDestroy
	public void destroyed() {
		System.out.println("destroyed");
	}

	public void draw() {
		MyEvent event = new MyEvent(this);
		publisher.publishEvent(event);

	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

}
