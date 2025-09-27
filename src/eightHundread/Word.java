package eightHundread;

import java.util.*;
public class Word {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        String word = sc.next();
        int lower = 0;
        int upper = 0;
        for(int i = 0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                lower++;
            }else {
                upper++;
            }
        }

        if(lower == upper){
            System.out.println(word.toLowerCase());
        }else if(lower > upper){
            System.out.println(word.toLowerCase());
        }else {
           System.out.println(word.toUpperCase());
        }
        sc.close();
    }
}
