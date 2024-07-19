import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 2, 3};
        int target1 = 2;
        int[] nums2 = {1, 2, 5, 2, 3};
        int target2 = 3;
        int[] nums3 = {1, 2, 5, 2, 3};
        int target3 = 5;

        System.out.println(targetIndicesWithoutSorting(nums1, target1));
        System.out.println(targetIndices(nums2, target2));
        System.out.println(targetIndices(nums3, target3));


    }

    public static List<Integer> targetIndices(int[] nums, int target) {

        //Time Complexity : O(NLogN)
        List<Integer> list = new ArrayList<>();
        //Sorting the index
        Arrays.sort(nums);

        //Adding the indexes where target is present
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }

        }
        // returning the list
        return list;
    }


    public static List<Integer> targetIndicesWithoutSorting(int[] nums, int target) {
        int smallerThanTarget = 0;
        int targetCount = 0;

        // The idea is to count the number of elements smaller than the target
        // without sorting the array. These elements will occupy the initial indices.
        // Then, the target elements will come after them.

        for (Integer n : nums) {
            if (n < target) {
                smallerThanTarget++;
            } else if (n == target) {
                targetCount++;
            }
        }

        // Create the output list and add indices where the target would be
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < targetCount; i++) {
            output.add(smallerThanTarget + i);
        }
        return output;
    }


}
