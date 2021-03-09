package review_oop.exercise1.vehicle;

import java.io.IOException;
import java.util.ArrayList;

public class VehicleManagerController {
    public static void main(String[] args) throws IOException {
    VehicleManager vehicleManager = new VehicleManager(new ArrayList<>());
    vehicleManager.displayMainMenu();
    vehicleManager.choice();
    }
}
