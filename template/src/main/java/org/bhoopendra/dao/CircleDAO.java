package org.bhoopendra.dao;

import java.util.List;

import org.bhoopendra.bean.Circle;

public interface CircleDAO {
	Circle createCircle(Circle circle) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
	int getCircleCount();
	String getCircleName();
	List<Circle> getAllCircle();
	void insertCircle();
	void createTriangleTable();
}
