package eightHundread;

import java.util.*;
public class SoldierAndBananas {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); //
        int n = sc.nextInt();// he have n dollars
        int w = sc.nextInt(); //banans
        int totalCostOfw = 0;
        for(int i = 1;i<=w;i++){
            totalCostOfw += (i *k);
        }

        if(totalCostOfw <= n) {
            System.out.println(0);
        }else {
            System.out.println(Math.abs(totalCostOfw - n));
        }

        sc.close();

    }
}
