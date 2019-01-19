package org.bhoopendra.learning.beans.impl;

import org.bhoopendra.learning.beans.Point;
import org.bhoopendra.learning.beans.Shape;

/**
 * Created by BHOOPENDRA on 7/24/2017.
 */
public class Hexagon implements Shape {
    private Point pointC;
    private Point pointD;
    private Point pointE;

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    public Point getPointE() {
        return pointE;
    }

    public void setPointE(Point pointE) {
        this.pointE = pointE;
    }

    @Override
    public void draw() {
        System.out.println(pointC+" "+pointD+" "+pointE);
    }
}
