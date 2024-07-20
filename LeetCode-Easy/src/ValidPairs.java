import java.util.HashSet;
import java.util.Set;

public class ValidPairs {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = {3, 3};
        int target2 = 6;

        System.out.println(validPairs(nums1, target1));
        System.out.println(validPairs(nums2, target2));

    }

    public static boolean validPairs(int[] nums, int target) {

        Set<Integer> set = new HashSet<>();

        for (Integer n : nums) {
            if (!set.contains(n)) {
                set.add(target - n);
            } else {
                return true;
            }
        }

        return false;
    }
}
