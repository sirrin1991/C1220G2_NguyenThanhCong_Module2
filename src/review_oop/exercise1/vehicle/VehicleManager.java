package review_oop.exercise1.vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleManager {

    List<Vehicle> vehicleList = new ArrayList<>();

    public VehicleManager(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void addVehicle(List<Vehicle> vehicleList) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the name of a motorcycle");
        String name = scanner.nextLine();
        boolean checkCC;
        int cc;
        do {
            System.out.println("Input the cc of a motorcycle");
            cc = scanner.nextInt();
            if (cc < 0) {
                System.out.println("Warning : Error input");
                checkCC = true;
            } else {
                checkCC = false;
            }
        } while (checkCC);
        System.out.println("Input the price of a motorcycle");
        int price = scanner.nextInt();
        getTax(cc, price);
        vehicleList.add(new Vehicle(price, cc, name));
        ReadWrite.write(vehicleList);
        vehicleList.clear();
    }

    public void displayList(List<Vehicle> vehicleList) {
        ReadWrite.read(vehicleList);
    }

    public void getTax(int cc, int price) {
        if (0 < cc && cc < 100) {
            Vehicle.setTax((float) price / 100);
        } else if (cc < 200) {
            Vehicle.setTax((float) price * 3 / 100);
        } else {
            Vehicle.setTax((float) price * 5 / 100);
        }
    }

    public void displayMainMenu() {
        System.out.println("Menu :\n" +
                "1.Add vehicle\n" +
                "2.Show information\n" +
                "3.Exit");
    }

    public void choice() throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean check= true;
        int choice;
        do {
            System.out.println("Input your choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addVehicle(vehicleList);
                    displayMainMenu();
                    choice();
                    break;
                case 2:
                    displayList(vehicleList);
                    displayMainMenu();
                    choice();
                    break;
                case 3:
                    System.out.println("----See you later----");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Warning : Error Choice");
                    System.out.println("_____________________");
                    check = false;
                    displayMainMenu();
                    choice();
            }
        } while (check);
    }

}
