package eightHundread;

import java.util.*;
public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            if(n==2 || n==3){
                System.out.println(2);
            }
            int actions = 0;
            for(int i = 0;i<n;i++){
                if(s.charAt(i) == '#'){
                    continue;
                }
                if(s.charAt(i) == '.' && s.charAt(i+1) == '.' && s.charAt(i+2) == '.'){
                    actions += 2;
                }else {

                }
            }
        }
    }
}
