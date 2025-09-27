package mathsForCp;

public class Mathx {
    public static boolean isOdd(int n){
        return (n & 1) == 1;
    }

    //[3,3,2,2,5,5,6,7,8,9,7,6,8,9]
    public static int findSingleNumber(int nums[]){
        int a = 0;
        for(int i = 0;i<nums.length;i++){
            a ^= nums[i];
        }

        return a;
    }

    // find the ith bit of  a number
    public static int findIthBit(int number, int i) {
        return (number & (1 << (i - 1))) != 0 ? 1 : 0;
    }

    //set the ith bit
    public static int setIthBit(int number, int i) {
        return number | (1 << (i - 1));
    }

    //reset the ith bit
    public static int resetIthBit(int number, int i) {
        return number & ~(1 << (i - 1));
    }

    //find the position of right most set bit
    //n & (-n);

    //negative if number in binary format





    public static void main(String[] args) {
         /*
            a ^ 1 = > complement of that number i.e you will get the opposite if that number 1- > 0 , 0 -> 1


            Conversion ->

            1- . Decimal to base b
            convert (17) base 10 to base 2
            keep dividing by base  , take remainders and right in opposote

            2 -> convert any base b to decimal
            steps -> multiply and add the power of base with digits



            5th operators left shift (<<)
            a << 1 =>  2 * a
            a << b =>  2 * 2^b

            6th operator right shift (>>)
            0011001 -> 001100



          */
    }


}
