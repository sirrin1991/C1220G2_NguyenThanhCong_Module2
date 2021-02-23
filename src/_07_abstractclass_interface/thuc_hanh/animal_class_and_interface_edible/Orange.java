package _07_abstractclass_interface.thuc_hanh.animal_class_and_interface_edible;

public class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Cam lột vỏ rồi ăn";
    }
}
class Test{
    public static void main(String[] args) {
        Orange o = new Orange();
        System.out.println(o.howToEat());
    }
}
