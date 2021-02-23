package _07_abstractclass_interface.thuc_hanh.animal_class_and_interface_edible;

public class TestAbstractClassAndInterface {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
    }
}
