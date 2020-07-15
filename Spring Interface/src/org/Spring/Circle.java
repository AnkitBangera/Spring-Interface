package org.Spring;

public class Circle implements Shape {
	private Point pointA;

	 

	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle [centre=" + pointA + "]");
	}
	
}
