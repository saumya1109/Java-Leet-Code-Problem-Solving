package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicatell {
    public static void main(String[] args) {
        // int[] nums = {1, 2, 3, 1, 2, 3};
        int[] nums = {1,0,1,1};
        int k = 2;

        System.out.println(containsNearbyDuplicate(nums, k));


    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(nums[i])) {
                int num = Math.abs(numsMap.get(nums[i]) - i);
                if (num <= k) return true;

            }

            numsMap.put(nums[i], i);
        }
        return false;
    }
}