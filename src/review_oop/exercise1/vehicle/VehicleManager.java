package review_oop.exercise1.vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleManager extends Vehicle {

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
        List<Vehicle> vehicleList1 = new ArrayList<>();
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
        Vehicle vehicle = new Vehicle();
        vehicle.setCc(cc);
        vehicle.setName(name);
        vehicle.setPrice(price);
        vehicle.setTax(super.getTax());
        vehicleList1.add(vehicle);
        ReadWrite.write(vehicleList1);

    }

    public void displayList() {
        List<Vehicle> vehicleList = new ArrayList<>(ReadWrite.read());
        for(Vehicle vehicle :vehicleList){
            System.out.println(vehicle);
        }
    }

    public void getTax(int cc, int price) {
        if (0 < cc && cc < 100) {
            super.setTax((float) price / 100);
        } else if (cc < 200) {
            super.setTax((float) price * 3 / 100);
        } else {
            super.setTax((float) price * 5 / 100);
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
                    displayList();
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
