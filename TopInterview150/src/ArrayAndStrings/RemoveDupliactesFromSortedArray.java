package ArrayAndStrings;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupliactesFromSortedArray {
    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int[] arr1 = {1, 2, 3, 5, 6, 7};
        int[] arr2 = {3, 6, 7, 8, 20};

        findDuplicates(arr1,arr2);

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


    static int[] findDuplicates(int[] arr1, int[] arr2) {

        Set<Integer> set1 =  new LinkedHashSet<>();
        Set<Integer> set2 =  new LinkedHashSet<>();

        for(int i=0;i<arr1.length;i++ ){
            set1.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++ ){
            set2.add(arr2[i]);
        }

        set1.retainAll(set2);

        System.out.println(set1);


        return new int[]{};
        // your code goes here
    }



}