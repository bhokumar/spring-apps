package org.bhoopendra.learning.beans.impl;

import org.bhoopendra.learning.beans.Point;
import org.bhoopendra.learning.beans.Shape;

/**
 * Created by BHOOPENDRA on 7/24/2017.
 */
public class Triangle implements Shape {
    private Point pointA;
    private Point pointB;
    private Point ponitC;

    public Point getPonitC() {
        return ponitC;
    }

    public void setPonitC(Point ponitC) {
        this.ponitC = ponitC;
    }

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

    @Override
    public void draw() {
        System.out.println(" drawing triangle! "+pointA+" "+pointB+" "+ponitC);
    }


}
