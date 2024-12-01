package com.teachmeskills.task_4.group;

import java.util.Objects;

public class Students {
    private String name;
    private String sex;
    private int id;

    public Students(String name, String sex, int id) {
        this.name = name;
        this.sex = sex;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", id=" + id +
                '}';
    }
}
