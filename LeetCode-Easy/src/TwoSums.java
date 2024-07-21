import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        /*{2=0, 7=1, 11=2, 15=3}
        *
        * nums[i=0]--> 2
        * map.contains (7)
        * retrurn 2's index and 7th's index
        * */
        int[] nums2 = {3,3};
        int target2 = 6;

        /*{{3=1}
         *
         * nums[i=0]--> 3
         * map.contains (3)
         * retrurn 3's index and 3th's index
         * */

        int[] nums3={3,2,4};
        int target3=6;

        /* {3=0,2=1, 4=2}
         *
         * nums[i=0]--> 3
         * map.contains(3) -- make sure these are not same element
         *
         * */


        System.out.println(findTwoSums(nums1, target1));
        System.out.println(findTwoSums(nums2, target2));
        System.out.println(findTwoSums(nums3, target3));
    }

    public static int[] findTwoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (Integer n : nums) {
            map.put(n, index++);
        }

        System.out.println(map);

        for(int i=0;i< nums.length;i++) {
           int complement = target- nums[i];
           if(map.containsKey(complement) && map.get(complement) !=i) {
               return new int[]{i, map.get(complement)};
           }
        }

        return new int[]{};
    }
}

