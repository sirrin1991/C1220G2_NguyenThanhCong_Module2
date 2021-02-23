package _07_abstractclass_interface.thuc_hanh.animal_class_and_interface_edible;

public class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Táo rửa sạch vỏ rồi ăn";
    }
}
class TestApple{
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.howToEat());
    }
}
