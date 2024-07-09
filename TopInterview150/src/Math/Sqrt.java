package Math;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(findSqrt(8));

    }

    public static int findSqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1;
        int right = x;

        while (left <=right) {
            int mid = left + (right - left) / 2;

            if (mid > x / mid) {
                right = mid - 1;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}