package _02_loop.bai_tap;

public class HienThiSoNguyenToNhoHon20 {
    public static void main(String[] args) {
        byte number = 2;
        while (number < 100){
            boolean check = true;
            for (int i = 2 ; i<=Math.sqrt(number);i++){
                if(number % i ==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(number);
            }
            number++;
        }

    }
}
