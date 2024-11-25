package com.teachmeskills.task_2.figure;

import com.teachmeskills.task_2.abstractFigure.Figure;

import java.awt.*;

public class Circle extends Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
