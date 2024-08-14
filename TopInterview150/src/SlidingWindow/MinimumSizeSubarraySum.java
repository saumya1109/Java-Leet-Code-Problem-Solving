package SlidingWindow;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        int target1 = 4;
        int[] nums1 = {1, 4, 4};

        int target2 = 11;
        int[] nums2 = {1, 1, 1, 1, 1, 1, 1, 1};
        
        int target3 = 11;
        int[] nums3 = {1, 2, 3, 4, 5};


        System.out.println(findMinimumSize(nums, target));
        System.out.println(findMinimumSize(nums1, target1));
        System.out.println(findMinimumSize(nums2, target2));
        System.out.println(findMinimumSize(nums3, target3));
    }

    public static int findMinimumSize(int[] nums, int target) {
        // We can use the two-pointer technique to find the subarray, as it involves identifying a contiguous segment of the array.
        // As we slide the window across the array, some values might be counted twice.
        // To avoid this, we simply subtract the value that is no longer part of the current window.


        int minL = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;

        while (i < nums.length) {
            // Expand the window by moving `j` to the right
            while (sum < target && j < nums.length) {
                sum += nums[j];
                j++;
            }

            // If the current window sum is equal to or greater than the target, update the minimum length
            if (sum >= target && (j - i) < minL) {
                minL = j - i;
            }

            // Shrink the window by moving `i` to the right
            sum = sum - nums[i];
            i++;

        }


        return (minL == Integer.MAX_VALUE) ? 0 : minL;
    }
}

