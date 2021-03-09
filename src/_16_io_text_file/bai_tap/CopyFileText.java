package _16_io_text_file.bai_tap;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileReader fileInputStream = null;
        FileWriter fileOutputStream = null;

        try {
            System.out.println("Input path of source file");
            String pathSourceFile = scanner.nextLine();
            File sourceFile = new File(pathSourceFile);

            if (sourceFile.isFile()){
                fileInputStream = new FileReader(pathSourceFile);
            }else {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileInputStream);
            System.out.println("Input path of target file");
            String pathTargetFile = scanner.nextLine();
            fileOutputStream = new FileWriter(pathTargetFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileOutputStream);


            int ch ;
            int count = 0;
            while ((ch = bufferedReader.read()) != -1){
                count++;
                bufferedWriter.write(ch);
            }
            bufferedWriter.flush();
            System.out.println("Source file has " + count + " characters");



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }
}
