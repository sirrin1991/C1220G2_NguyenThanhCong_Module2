package _10_dsa_list.bai_tap.array_list;

import java.util.Arrays;

public class MyList<E> {
    public int size;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[10];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public int size() {
        return this.size;
    }

    public void add(int index, E element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Error");
        }
        if (size == elements.length){
            ensureCapa();
        }
        for (int i = size - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        E temp = elementData(index);
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Error");
        }
        for(int i = index ; i <size-1;i++){
            elements[i]= elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return temp;
    }
    private E elementData(int index){
        return (E) elements[index];
    }
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }
    public boolean contains(E o){
        boolean isExist = false;
        for(int i = 0;i<size;i++){
            if(elements[i]== o){
                isExist = true;
            }
        }
        return isExist;
    }
    public boolean add(E o){
        if(size == elements.length){
            return false;
        }
        elements[size++] = o;
        return true;
    }
    public MyList<E> clone(){
        MyList newlist = new MyList();
        newlist.size = size;
        newlist.elements = Arrays.copyOf(elements, size);
        return (MyList<E>) newlist;
    }

    @Override

    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) result.append(", ");
        }

        return result.toString() + "]";
    }


}
