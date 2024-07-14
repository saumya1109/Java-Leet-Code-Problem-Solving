package ArrayAndStrings;

public class RemoveDupliactesFromSortedArray {
    public static void main(String[] args) {
        //[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] array = {0, 0, 1, 1, 1, 2, 3, 3, 4};

        System.out.println( removeDuplicatesUsingTwoPointer(array));

        int[] output = removeDuplicates(array);

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }


    }


    public static int[] removeDuplicates(int[] nums) {
        int index = 0;


        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }

        return nums;
    }


    public static int removeDuplicatesUsingTwoPointer(int[] array) {
    /* We are going to use two pointers technique here,
    * 0, 0, 1, 1, 1, 2, 2, 3, 3, 4   ptr1=0 (left),ptr2=1 (right)
    * the ptr1 will point to the position that needs to be filled
    * ptr2 will find the unique elements
    *
    * Step1: Initialise ptr1 from the first position and ptr2 from the second position in the array
    * Step2: Keep on comparing and puting the unique elements in the array until ptr2 is lesser than the lenth of the array
    * Step3: return ptr1+1 as these are elements that are unique
    * */
        int ptr1 = 0;
        int ptr2 = 1;

        while (ptr2 != array.length) {
            if (array[ptr1] == array[ptr2]) {
                ptr2++;
            } else {
                ptr1++;
                array[ptr1] = array[ptr2];
            }


        }
        return ptr1 + 1;
    }
}