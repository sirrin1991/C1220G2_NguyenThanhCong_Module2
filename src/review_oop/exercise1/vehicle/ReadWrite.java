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
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static List<Vehicle> read() {
        List<Vehicle> vehicleList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader("src\\review_oop\\exercise1\\vehicle\\Vehicle.csv");
            bufferedReader = new BufferedReader(fileReader);

            String line ;
            String [] temp;
            while ((line=bufferedReader.readLine())!=null){
                temp = line.split(",");
                Vehicle vehicle = new Vehicle();
                vehicle.setPrice(Integer.parseInt(temp[0]));
                vehicle.setCc(Integer.parseInt(temp[1]));
                vehicle.setName(temp[2]);
                vehicle.setTax(Float.parseFloat(temp[3]));
                vehicleList.add(vehicle);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return vehicleList;
    }
}
