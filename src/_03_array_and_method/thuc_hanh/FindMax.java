package _03_array_and_method.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arrayNum;
        do{
            System.out.println("Nhập số lượng tỷ phú");
            size = scanner.nextInt();
            if(size >20 || size <=0){
                System.out.println("Vui lòng nhập trong khoảng 1-20");
            }
        }while (size >20 || size <=0);
        arrayNum = new int[size];
        for (int i = 0 ; i <arrayNum.length;i++){
            System.out.println("Nhập tài sản của tỷ phú thứ "+ (i+1)+" : ");
            arrayNum[i]= scanner.nextInt();
        }
//        System.out.println(Arrays.toString(arrayNum));
        int max = arrayNum [0];
        int position = 0;
        for(int j = 0;j<arrayNum.length;j++){
            if (arrayNum[j]>max){
                max = arrayNum[j];
                position = j+1;
            }
        }
        System.out.println("Tài sản lớn nhất là "+ max+" ở vị trí số "+ position );

    }
}
