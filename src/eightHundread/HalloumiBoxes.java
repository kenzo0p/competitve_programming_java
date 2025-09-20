package eightHundread;

import java.util.Arrays;
import java.util.Scanner;

public class HalloumiBoxes {
    /*
    * The conclusion is if  k==1 we cant revrse
    * but in case of k >  1 we can sort as we can reverse it any number of time
    * so the condition is if k > 1 then  yes and also if array is already sorted then it will always yes
    * */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int copyArr[] = Arrays.copyOf(arr, arr.length);
            Arrays.sort(copyArr);
            if(Arrays.equals(copyArr, arr) || k > 1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
        sc.close();
    }
}
