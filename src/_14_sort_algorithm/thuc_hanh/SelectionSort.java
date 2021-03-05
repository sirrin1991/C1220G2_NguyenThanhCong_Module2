package _14_sort_algorithm.thuc_hanh;
import java.util.*;
public class SelectionSort {
    static void seletionSort (int[] arrayNumbers){
        int length = arrayNumbers.length;
        for(int i = 0 ; i < length;i++){
            for (int j = i +1; j < length;j++){
                int max = arrayNumbers[i];
                if(arrayNumbers[j]> max){
                    arrayNumbers[i]=arrayNumbers[j];
                    arrayNumbers[j]=max;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7};
        seletionSort(n);
        System.out.println(Arrays.toString(n));
    }
}
