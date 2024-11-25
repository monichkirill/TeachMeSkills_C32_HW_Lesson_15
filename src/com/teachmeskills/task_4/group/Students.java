package com.teachmeskills.task_4.group;

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
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", id=" + id +
                '}';
    }
}
