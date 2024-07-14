package ArrayAndStrings;

public class RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        /*We are going to use 2 pointers approach here
         * This array can only have at most 2(count) unique elements
         * eg 1,2,2,3,3,3,4 --> 1,2,2,3,3,4
         * eg 1,2,2,2,3,3,4 --> 1,2,2,3,3,4
         *
         *
         * The thing here to keep in mind we can't just solve it like the 1 version of this question
         * as we need to check also if the count of unique elements doesn't exceed 2
         *
         * */

        if (nums.length <= 2) {
            //for 1 st and second element no matter if it's same or duplicate they can stay
            // This is for optimsation as we need not to fill the first two position

            return nums.length;
        }

        int i = 2; // Start placing new elements from index 2

        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}

