package org.school.spring.bean;

public class Triangle {
	/*
	 * private List<Point> points;
	 * 
	 * public List<Point> getPoints() { return points; }
	 * 
	 * public void setPoints(List<Point> points) { this.points = points; }
	 */
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("PointA  coordinate : (" + pointA.getX() + ", " + pointA.getY() + ")");
		System.out.println("PointB  coordinate : (" + pointB.getX() + ", " + pointB.getY() + ")");
		System.out.println("PointC  coordinate : (" + pointC.getX() + ", " + pointC.getY() + ")");
	}
	
	public void init(){
		System.out.println("init");
	}
	
	public void destroy(){
		System.out.println("destroy");
	}

}
