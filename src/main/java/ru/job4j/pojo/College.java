package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Артур Нагиев");
        student.setGroup("8");
        student.setMatriculationDate("14.04.2024");

        System.out.println("Студент " + student.getFullName() + " поступил в группу " + student.getGroup() + " " + student.getMatriculationDate());
    }
}
