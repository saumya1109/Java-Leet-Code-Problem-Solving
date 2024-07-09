package Math;

public class ReverseInteger {
    public static void main(String[] args) {
        //int num = 120;
        int num =  -123;
        System.out.println(reverse(num));

    }

    public static int reverse(int x) {
        int reversal = 0;
        boolean isNegative = false;
        if (x < 0) isNegative = true;

        x = Math.abs(x);

        while (x != 0) {
            int lastDigit = x % 10;

            if (reversal > (Integer.MAX_VALUE - lastDigit) / 10) {
                return 0;
            }
            reversal = reversal * 10 + lastDigit;
            x = x / 10;

        }

        if (isNegative) {
            return -reversal;
        }
        return reversal;

    }
}