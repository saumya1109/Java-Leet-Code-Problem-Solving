package HashMap;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int number = 2;
        //int number =9;
        System.out.println(findHappyNumber(number));
    }


    public static boolean findHappyNumber(int n) {
            Set<Integer> set = new HashSet<>();
            while (n != 1 && !set.contains(n)) {
                set.add(n);
                n = getSquaredSum(n);
            }

            return n == 1;
        }

        public static int getSquaredSum(int n) {
            int sum=0;
            while (n > 0) {
                int result = n % 10;
                sum += Math.pow(result, 2);
                n = n / 10;
            }

            return sum;
        }
    }
