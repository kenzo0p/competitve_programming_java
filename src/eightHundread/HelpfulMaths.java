package eightHundread;

import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() == 1) {
            System.out.println(s);
        } else {
            int ones = 0;
            int twos = 0;
            int threes = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    ones++;
                } else if (s.charAt(i) == '2') {
                    twos++;
                } else if (s.charAt(i) == '3') {
                    threes++;
                }
            }
            StringBuilder sb = new StringBuilder();
            while (ones != 0) {
                sb.append("1").append("+");
                ones--;
            }
            while (twos != 0) {
                sb.append("2").append("+");
                twos--;
            }
            while (threes != 0) {
                sb.append("3").append("+");
                threes--;
            }


            sb = sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb.toString());
        }
    }
}
