package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFIO("Mokrushnikov Artem Sergeevich");
        student.setGroup("14b");
        student.setDate(new Date());
        System.out.println(student.getFIO() + " поступил " + student.getDate() + " в группу " + student.getGroup());
    }
}
