package eightHundread;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();

        while(t-- > 0){
            String word= sc.next();
            if(word.length() > 10){
                int length = word.length()-2;
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(length + 1);
                System.out.println(firstChar + "" + length + "" + lastChar);
            }else {
                System.out.println(word);
            }
        }
    }
}
