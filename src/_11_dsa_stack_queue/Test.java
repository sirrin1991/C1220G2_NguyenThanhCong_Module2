package _11_dsa_stack_queue;


import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"huy"));
        list.add(new Student(2,"An"));
        list.add(new Student(6,"Cong"));
        list.add(new Student(4,"Tuan"));
        list.add(new Student(5,"Tai"));
        for (Student student : list){
            System.out.println(student.toString());
        }
        list.sort(Comparator.comparing(Student::getId));
        System.out.println("___________");
        for (Student student : list){
            System.out.println(student.toString());
        }
        list.sort((o1, o2) -> o2.getId()-o1.getId());
        System.out.println("__________");
        System.out.println(Arrays.toString(list.toArray()));
    }
}