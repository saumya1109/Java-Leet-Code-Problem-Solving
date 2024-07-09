package Math;

public class Palindrome {

    public static void main(String[] args) {
        //int num = 121;
        //int num = 0;
       int num =-121;

        System.out.println(isPalindrome(num));

    }


    public static boolean isPalindrome(int x) {
        int actualNumber= x;
        int reverse =0;
        if(x<0) {
            return false;
        }
        else{
            while (x>0) {
                reverse =reverse * 10 + x % 10;
                x=x/10;
            }
        }

        if(actualNumber== reverse || actualNumber==0){
            return true;
        }

        return false;

    }
}