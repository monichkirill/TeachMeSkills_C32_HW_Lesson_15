package com.teachmeskills.task_2.figure;

import com.teachmeskills.task_2.abstractFigure.Figure;

public class Rectangle extends Figure {
    double width;
    double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width * height;
    }
}
