package _10_dsa_list.bai_tap.array_list;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>(5);
        list.add("b");
        list.add("d");
        list.add("c");
        list.add(3,"m");
        MyList newlist = list.clone();
        System.out.println(newlist.toString());

    }
}
