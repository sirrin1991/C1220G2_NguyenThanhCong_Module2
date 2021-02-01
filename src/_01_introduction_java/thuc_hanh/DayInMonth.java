package _01_introduction_java.thuc_hanh;
import java.util.Scanner;
public class DayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng cần tính ngày");
        int month = scanner.nextInt();
        if(month < 0 || month > 12){
            System.out.println("Vui lòng nhập từ 1 đến 12");
        }else {
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng "+ month +" có 31 ngày");
                    break;
                case 2:
                    System.out.println("Tháng 2 có 28 hoặc 29 ngày");
                    break;
                default:
                    System.out.println("Tháng "+ month+" có 30 ngày");
            }
        }



    }
}
