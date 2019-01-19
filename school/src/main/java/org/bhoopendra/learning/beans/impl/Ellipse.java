package org.bhoopendra.learning.beans.impl;

import org.bhoopendra.learning.beans.Point;
import org.bhoopendra.learning.beans.Shape;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by BHOOPENDRA on 7/24/2017.
 */
public class Ellipse implements Shape {
    private Map<Point,Point> points;

    public Map<Point, Point> getPoints() {
        return points;
    }

    public void setPoints(Map<Point, Point> points) {
        this.points = points;
    }

    @Override
    public void draw() {
        points.forEach((a,b)-> System.out.println(a));
    }
}
