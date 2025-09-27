package eightHundread;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        int count = 0;
        long tempN = n;
        while (tempN != 0) {
            long digit = tempN % 10;
            if (digit == 4 || digit == 7) {
                count++;
            }
            tempN /= 10;
        }

        if (count == 0) {
            System.out.println("NO");
            return;
        }

        int tempCount = count;
        boolean isLucky = true;
        while (tempCount != 0) {
            int digit = tempCount % 10;
            if (digit != 4 && digit != 7) {
                isLucky = false;
                break;
            }
            tempCount /= 10;
        }

        System.out.println(isLucky ? "YES" : "NO");
    }
}
