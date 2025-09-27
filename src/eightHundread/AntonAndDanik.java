package eightHundread;

import java.util.Scanner;
public class AntonAndDanik {
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int anto = 0;
        int dan = 0;
        for(int i  = 0;i<s.length();i++){
            if(s.charAt(i) == 'A'){
                anto++;
            }else {
                dan++;
            }
        }

        if(anto == dan){
            System.out.println("Friendship");
        }else if(anto > dan){
            System.out.println("Anton");
        }else {
            System.out.println("Danik");
        }
        sc.close();
    }
}
