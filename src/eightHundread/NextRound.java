package eightHundread;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int max = arr[k-1];
        for(int i = 0;i<arr.length;i++) {
            if (arr[i] >= max && arr[i]  > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
