package eightHundread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            List<Integer> list = new ArrayList<>();
            list.add(0);
            for(int i = 0;i<n;i++){
                int num = sc.nextInt();
                list.add(num);
            }
            list.add(x);
            n = list.size();

            int maxDistanceBetPoints = Integer.MIN_VALUE;
            for(int i = 1;i<n;i++){
                if(i == n-1){
                    maxDistanceBetPoints = Math.max(2 * list.get(i) - list.get(i-1) , maxDistanceBetPoints);
                }else {
                    maxDistanceBetPoints = Math.max(list.get(i) - list.get(i-1) , maxDistanceBetPoints);
                }
            }
            System.out.println(maxDistanceBetPoints);
        }
        sc.close();
    }
}
