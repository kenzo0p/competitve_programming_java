package eightHundread;


import java.util.*;
public class WordSubtraction {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        while(k-- > 0){
            int lastDigit = n %10;
            if(lastDigit == 0){
                n /=10;
            }else {
                n--;
            }
        }
        System.out.println(n);
        sc.close();

    }
}
