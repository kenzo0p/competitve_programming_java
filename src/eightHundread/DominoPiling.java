package eightHundread;

import java.util.Scanner;

public class DominoPiling {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int total = m*n;
        System.out.println(total / 2);
        sc.close();
    }
}
