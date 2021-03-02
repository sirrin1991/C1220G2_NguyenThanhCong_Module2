package _012_java_collection_framework.thuc_hanh.Test;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        System.out.println("---------------");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        System.out.println("-----------");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        linkedHashMap.put("Coo", 25);
        System.out.println(linkedHashMap);
        System.out.println("The age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
