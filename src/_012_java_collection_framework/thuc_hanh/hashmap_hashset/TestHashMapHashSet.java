package _012_java_collection_framework.thuc_hanh.hashmap_hashset;
import java.util.*;
public class TestHashMapHashSet {
    public static void main(String[] args) {
        HashMap<String,Student> studentHashMap= new HashMap<>();
        HashSet<Student> studentHashSet = new HashSet<>();
        Student student1 = new Student("Công",31,"Đà Nẵng");
        Student student2 = new Student("Huy",31,"Đà Nẵng");
        Student student3 = new Student("Sang",30,"Đà Nẵng");
//        studentHashMap.put(a,student1);
//        studentHashMap.put(2,student2);
//        studentHashMap.put(3,student3);
//        studentHashMap.put(4,student3);
//        studentHashMap.put(5,student3);
//        studentHashMap.put(7,student1);
//        studentHashMap.put(9,student2);
//        studentHashMap.put(6,null);
//        studentHashMap.put(10,null);
        studentHashMap.put("a",student1);
        studentHashMap.put("b",student2);
        studentHashMap.put("c",student3);
        studentHashMap.put("e",student3);
        studentHashMap.put("f",student3);
        studentHashMap.put("d",student1);
        studentHashMap.put("M",student2);
        studentHashMap.put("l",null);
        studentHashMap.put("n",null);
        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student3);
        studentHashSet.add(null);
        studentHashSet.add(new Student("Tùng",28,"Đà Nẵg"));
        studentHashSet.add(new Student("Tùng",55,"Đà Nẵg"));
        for(HashMap.Entry<String, Student> student : studentHashMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("------------");
//        for(Student student: studentHashSet){
//            System.out.println(student.toString());
//        }
        System.out.println(studentHashSet);
    }
}
