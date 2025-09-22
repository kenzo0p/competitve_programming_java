package eightHundread;

import java.util.*;
public class Team {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int theyCan = 0;
        while(t-- > 0 ){
            int p = sc.nextInt();
            int v = sc.nextInt();
            int to = sc.nextInt();

            int knowSol = p + v + to;
            if(knowSol >=2){
                theyCan++;
            }

        }

        System.out.println(theyCan);
        sc.close();
    }
}
