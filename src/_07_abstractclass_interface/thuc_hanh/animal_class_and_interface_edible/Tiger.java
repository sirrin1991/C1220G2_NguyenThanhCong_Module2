package _07_abstractclass_interface.thuc_hanh.animal_class_and_interface_edible;

public class Tiger extends Animal {

    @Override
    String makeSound() {
        return "Hổ : graoooooooooooooo";
    }
}
class TestTiger{
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        System.out.println(tiger.makeSound());
    }
}
