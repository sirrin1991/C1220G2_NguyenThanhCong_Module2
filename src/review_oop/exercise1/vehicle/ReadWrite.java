package review_oop.exercise1.vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadWrite {
    static void write(List<Vehicle> list) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter("src\\review_oop\\exercise1\\vehicle\\Vehicle.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Vehicle vehicle : list) {
                bufferedWriter.write(vehicle.getInfor());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void read(List<Vehicle> list) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader("src\\review_oop\\exercise1\\vehicle\\Vehicle.csv");
            bufferedReader = new BufferedReader(fileReader);

            String str ;
            while ((str = bufferedReader.readLine()) != null){
                printVehicle(parseCsvLine(str));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static List<String> parseCsvLine(String csvLine) {
        List<String> stringList = new ArrayList<>();
        if(csvLine!=null){
            String[] strings = csvLine.split(",");
            Collections.addAll(stringList, strings);
        }
        return stringList;
    }

    static void printVehicle(List<String> vehicle){
        System.out.println("Vehicle's name : " + vehicle.get(0)  +
                ", price =" + vehicle.get(1) + ", cc=" + vehicle.get(2));
    }
}
