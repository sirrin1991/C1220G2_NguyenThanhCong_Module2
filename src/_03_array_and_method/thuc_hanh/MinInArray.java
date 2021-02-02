package _03_array_and_method.thuc_hanh;

public class MinInArray {
    public static int minValue(int[] array){
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8,-1, 1, 6, 9};
        System.out.println("The smallest element in the array is: " + minValue(arr));

    }
}
