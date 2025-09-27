package mathsForCp;

public class PowerOfTwo {
    public static void main(String []args){
        int n = 31; // Note : fix for n = 0
        if(n == 0){
            //return false;
        }
        boolean ans = (n&(n-1)) == 0;
        System.out.println(ans);
    }
}
