package _05_access_modifier_static_method.thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCars);

    }
    static class Car {

        private String name;

        private String engine;


        public static int numberOfCars;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEngine() {
            return engine;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }

        public Car(String name, String engine) {

            this.name = name;

            this.engine = engine;

            numberOfCars++;

        }
    }

}
//class Car {
//
//    private String name;
//
//    private String engine;
//
//
//    public static int numberOfCars;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEngine() {
//        return engine;
//    }
//
//    public void setEngine(String engine) {
//        this.engine = engine;
//    }
//
//    public Car(String name, String engine) {
//
//        this.name = name;
//
//        this.engine = engine;
//
//        numberOfCars++;
//
//    }
//}
