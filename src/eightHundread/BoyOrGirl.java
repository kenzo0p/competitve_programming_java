package eightHundread;


import java.util.*;
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        HashSet<Character>set = new HashSet<>();
        for(char ch : s.toCharArray()){
            set.add(ch);
        }
        int n = set.size();
        if(n %2 == 0){
            System.out.println("CHAT WITH HER!");
        }else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}
