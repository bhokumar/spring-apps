package org.school.spring.learning.aspect.service;

import org.school.spring.learning.aspect.Loggable;
import org.school.spring.learning.aspect.bean.Rectangle;
import org.school.spring.learning.aspect.bean.Square;

public class ShapeService {
	private Rectangle rectangle;
	private Square square;
	
	public Rectangle getRectangle() {
		return rectangle;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	@Loggable
	public Square getSquare() {
		return square;
	}
	public void setSquare(Square square) {
		this.square = square;
	}
}
