package _16_io_text_file.bai_tap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFileCsv {
    private static final String COMMA_DELIMITER = ",";
    private static final String PATH_FILE = "D:\\C1220G2_NguyenThanhCong_Module2\\src\\_16_io_text_file\\bai_tap\\bai_tapexample.csv";

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line = "";
            br = new BufferedReader(new FileReader(PATH_FILE));

            while ((line=br.readLine()) != null){
                printCountry(parseCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(br!=null){
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            Collections.addAll(result, splitData);
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [ Name= " + country.get(5)
                        + "]");
    }
}
