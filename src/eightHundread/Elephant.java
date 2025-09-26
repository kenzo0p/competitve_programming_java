package eightHundread;

import java.util.Scanner;
public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = {5,4,3,2,1};
        int i = 0;
        int steps = 0;
        while(x!=0){
            while(arr[i] <= x){
                x-=arr[i];
                steps++;
            }
            i++;
        }

        System.out.println(steps);
        sc.close();
    }
}
