package _07_abstractclass_interface.thuc_hanh.interface_comparator;

import _07_abstractclass_interface.thuc_hanh.interface_comparable.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        return Double.compare(o1.getRadius(), o2.getRadius());
    }
}
