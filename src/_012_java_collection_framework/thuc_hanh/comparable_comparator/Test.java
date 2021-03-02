package _012_java_collection_framework.thuc_hanh.comparable_comparator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Công", 31, "Đà Nẵng");
        Student student2 = new Student("Kiên", 25, "Đà Nẵng");
        Student student3 = new Student("Thăng", 30, "Đà Nẵng");
        Student student4 = new Student("An", 26, "Đà Nẵng");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        System.out.println("Sorted by name");
        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        System.out.println("--------------");
        System.out.println("Sorted by age");
        studentList.sort(Comparator.comparingInt(Student::getAge));
        for (Student student : studentList) {
            System.out.println(student.toString());
        }

    }
}

