package eightHundread;

import java.util.*;
public class BeatAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b ){
            System.out.println(1);
        }else {
            int years = 0;
            while(a <= b){
                 years++;
                 a *=3;
                 b*=2;
            }

            System.out.println(years);
        }
        sc.close();

    }
}
