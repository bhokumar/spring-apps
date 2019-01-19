package org.bhoopendra.learning.beans.impl;

import org.bhoopendra.learning.beans.Point;
import org.bhoopendra.learning.beans.Shape;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by BHOOPENDRA on 7/24/2017.
 */
public class Square implements Shape {
    Set<Point> points;

    public Set<Point> getPoints() {
        return points;
    }

    public void setPoints(Set<Point> points) {
        this.points = points;
    }

    @Override
    public void draw() {
        Iterator<Point> pointIterator = points.iterator();
        while (pointIterator.hasNext()){
            System.out.println(pointIterator.next());
        }
    }

}
