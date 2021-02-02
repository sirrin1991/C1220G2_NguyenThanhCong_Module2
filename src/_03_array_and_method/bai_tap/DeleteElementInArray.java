package _03_array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] arrayNum = {1,2,3,4,5,7,8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa");
        int number = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < arrayNum.length; i++) {
            if (number == arrayNum[i]){
                index = i;
                arrayNum[i] = 0;
            }
        }
        System.out.println(index);
        if(index==-1){
            System.out.println( number+ " không có trong mảng");
        }else {
            for (int j = index;j<arrayNum.length-1;j++){
                int temp = arrayNum[j];
                arrayNum[j]=arrayNum[j+1];
                arrayNum[j+1]=temp;
            }
        }
        System.out.println(Arrays.toString(arrayNum));
    }

}
