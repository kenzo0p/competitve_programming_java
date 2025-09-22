package eightHundread;

import java.util.Scanner;

public class BitPlusPlus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;
        while(n-- > 0){
            String op = sc.next();
            if (op.charAt(0) == '-') {
                --x;
            }else if(op.charAt(2) == '-'){
                x--;
            } else if (op.charAt(0) == '+') {
                ++x;
            }else  {
                x++;
            }
        }

        System.out.println(x);
        sc.close();
    }
}
