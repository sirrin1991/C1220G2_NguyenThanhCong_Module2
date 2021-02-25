package _10_dsa_list.bai_tap.linked_list;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(3);
        list.addLast(4);
        System.out.println(list.get(0));

    }
}
