package com.teachmeskills.task_4;

import com.teachmeskills.task_4.group.Students;

import java.util.HashSet;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        Students members1 = new Students("Andrey","Male", 1);
        Students members2 = new Students("Dmitriy","Male", 2);
        Students members3 = new Students("Ilya","Male", 3);
        Students members4 = new Students("Bogdan", "Male", 4);
        Students members5 = new Students("Igor","Male", 5);
        Students members6 = new Students("Marina","Female", 6);
        Students members7 = new Students("Daniil","Male", 7);
        Students members8 = new Students("Sultan","Male", 8);
        Students members9 = new Students("Georgi","Male", 9);
        Students members10 = new Students("Kirill","Male", 10);
        Students members11 = new Students("Kate","Female", 11);
        Students members12 = new Students("Dmitry","Male", 12);
        Students members13 = new Students("Rita","Female", 13);
        Students members14 = new Students("Vlad","Male", 14);
        Students members15 = new Students("Sergio","Male", 15);
        Students members16 = new Students("Kirill","Male", 16);
        Students members17 = new Students("Oleg","Male", 17);

        Set<Students> students = new HashSet<>();
        students.add(members1);
        students.add(members2);
        students.add(members3);
        students.add(members4);
        students.add(members5);
        students.add(members6);
        students.add(members7);
        students.add(members8);
        students.add(members9);
        students.add(members10);
        students.add(members11);
        students.add(members12);
        students.add(members13);
        students.add(members14);
        students.add(members15);
        students.add(members16);
        students.add(members17);

        for (Students student : students) {
            System.out.println(student);
        }
    }
}
