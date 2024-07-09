package Math;

public class PowXn {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000,10));

    }

    public static double myPow(double x, int n) {

        // visually (x^n)  x-- base and n -- the power
        return  binaryExp(x, (long) n);


    }

    // write a helper function that calculated the power using binary exponential
    // taking 'n' as long to prevent overflow from integer 32 bits
    public static double binaryExp(double x, long n){

        if (n==0) return 1;

        if(n<0) {
            return 1.0/ binaryExp(x,-n);
        }

        if(n%2==0){
            return binaryExp(x*x, n/2);
        }
        else{
            return x* binaryExp(x*x,(n-1)/2);
        }
    }
}