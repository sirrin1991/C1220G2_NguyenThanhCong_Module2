package _07_abstractclass_interface.thuc_hanh.animal_class_and_interface_edible;


public class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Mổ thóc";
    }

    @Override
    String makeSound() {
        return "Gà : cục tác";
    }
}
class testchicken{
    public static void main(String[] args) {
        Chicken c1 = new Chicken();
        System.out.println(c1.howToEat());
        System.out.println(c1.makeSound());
    }


}
