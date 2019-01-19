package org.bhoopendra.learning.beans;

/**
 * Created by BHOOPENDRA on 7/24/2017.
 */
public class Point {
    private int a,b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean equals(final Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        Point point = (Point)obj;
        return point.a!=a?false:point.b!=b?false:true;
    }

    public int hashcode(){
        return (a+b)*31;
    }

    @Override
    public String toString() {
        return "Point{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
