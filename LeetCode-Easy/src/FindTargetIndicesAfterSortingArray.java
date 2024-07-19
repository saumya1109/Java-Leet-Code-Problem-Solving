import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,5,2,3}; int target1 = 2;
        int[] nums2 = {1,2,5,2,3}; int target2 = 3;
        int[] nums3 = {1,2,5,2,3}; int target3 = 5;

        System.out.println(targetIndices(nums1,target1));
        System.out.println(targetIndices(nums2,target2));
        System.out.println(targetIndices(nums3,target3));


    }

    public static  List<Integer> targetIndices(int[] nums, int target) {

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
}
