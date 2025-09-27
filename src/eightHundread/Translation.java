package eightHundread;


import java.util.*;
public class Translation {
    private static boolean checkIsEqual(int i , int j , String s , String t){
        if(i == s.length() && j < 0) return true;
        if(s.charAt(i) != t.charAt(j)){
            return false;
        }

        return checkIsEqual(i+1 , j-1 , s, t);
    }
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if(t.length() != s.length()){
            System.out.println("NO");
            return ;
        }

        boolean isEqual = checkIsEqual(0 ,t.length()-1 ,s , t);
        if(isEqual){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        sc.close();
    }
}
