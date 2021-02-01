package _01_introduction_java.thuc_hanh;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng");
        double weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao");
        double height = scanner.nextDouble();
        double bmi = weight/(height*height);
        if (bmi < 18.5){
            System.out.println("BMI = "+ bmi + " Underweight");
        }else if (18.5 <= bmi && bmi < 25.0){
            System.out.println("BMI = "+ bmi + " Normal");
        }else if (25.0 <= bmi && bmi < 30){
            System.out.println("BMI = "+ bmi + " Overweight");
        }else {
            System.out.println("BMI = "+ bmi + " Obese");
        }
    }
}
