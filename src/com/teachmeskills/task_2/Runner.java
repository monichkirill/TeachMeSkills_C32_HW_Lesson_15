package com.teachmeskills.task_2;

import com.teachmeskills.task_2.abstractFigure.Figure;
import com.teachmeskills.task_2.figure.Circle;
import com.teachmeskills.task_2.figure.Rectangle;
import com.teachmeskills.task_2.figure.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(4);
        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(2,8);
        Triangle triangle1 = new Triangle(2,3,4);
        Triangle triangle2 = new Triangle(5,6,7);

        List<Figure> figures = new ArrayList<>();
        figures.add(circle1);
        figures.add(circle2);
        figures.add(rectangle1);
        figures.add(rectangle2);
        figures.add(triangle1);
        figures.add(triangle2);

        double totalPerimeter = 0;

        for (Figure figure : figures) {
            System.out.println(figure);
            totalPerimeter += figure.getPerimeter();
        }

        System.out.println("Total perimeter: " + totalPerimeter);
    }
}
