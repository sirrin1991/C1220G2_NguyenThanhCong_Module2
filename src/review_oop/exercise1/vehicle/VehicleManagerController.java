package review_oop.exercise1.vehicle;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
    VehicleManager vehicleManager = new VehicleManager(new ArrayList<>());
    vehicleManager.displayMainMenu();
    vehicleManager.choice();

    }
}
