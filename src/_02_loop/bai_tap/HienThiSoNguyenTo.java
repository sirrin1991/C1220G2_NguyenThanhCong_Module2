package _02_loop.bai_tap;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        byte count = 0;
        byte N = 20;
        int temp = 2;
        do {
            boolean check = true;
            for(int i = 2 ; i <= Math.sqrt(temp);i++){
                if (temp % i ==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(temp);
                count++;
            }
            temp++;

        }while (count != N);
    }
}
