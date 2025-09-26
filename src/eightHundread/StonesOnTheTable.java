package eightHundread;

import java.util.*;
public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int neigh = 0;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                neigh++;
            }
        }

        System.out.println(neigh);

        sc.close();
    }
}
