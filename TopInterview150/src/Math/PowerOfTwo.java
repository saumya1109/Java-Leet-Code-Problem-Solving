package Math;
public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(isPowerOfTwo(num));
    }

    public static boolean isPowerOfTwo(int n) {
        while (n > 0) {
            if (n == 1) return true;
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                return false;
            }
        }

        return false;
    }
}