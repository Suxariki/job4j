package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Mokrushnikov Artem Sergeevich");
        student.setGroup("14b");
        student.setDate(new Date());
        System.out.println(student.getFio() + " поступил " + student.getDate() + " в группу " + student.getGroup());
    }
}
