package org.bhoopendra.learning.beans.impl;

import org.bhoopendra.learning.beans.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.PropertyResolver;

/**
 * Created by BHOOPENDRA on 7/24/2017.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}
