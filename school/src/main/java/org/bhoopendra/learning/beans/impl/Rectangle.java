package org.bhoopendra.learning.beans.impl;

import org.bhoopendra.learning.beans.Point;
import org.bhoopendra.learning.beans.Shape;

import java.util.List;

/**
 * Created by BHOOPENDRA on 7/24/2017.
 */
public class Rectangle implements Shape {
    List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public void draw() {
        for(Point point : points){
            System.out.println(point);
        }
    }
}
