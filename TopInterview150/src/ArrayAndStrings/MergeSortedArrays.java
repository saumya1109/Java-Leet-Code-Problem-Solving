package ArrayAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {2, 5, 6};
        int m = 3, n = 3;

        int[] nums3 = {1, 2, 3, 4, 0, 0, 0}, nums4 = {2, 5, 6};
        int m1 = 4, n1 = 3;
        // System.out.println(merge(nums1, m, nums2, n));
        System.out.println(merge1(nums1, m, nums2, n));


    }


    //Brute-force way     O((M+N)Log(M+N))
    // Arrays.sort uses Timsort --> O(klogk)
    // here
    public static List<Integer> mergeUsingArrayList(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            nums1[i] = list.get(i);
        }
        return list;
    }

    //This is also brute-force as we are adding the numbers first and then sorting it with time complexity of O((M+N)Log(M+N))
    public static void mergeWithoutUsingArrayList(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;

        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[k];
            k++;
        }
        Arrays.sort(nums1);
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m - 1;
        int ptr2 = n - 1;
        int pMerge = m + n - 1;

        while (ptr2 >= 0) {
            if (ptr1 >= 0 && nums1[ptr1] > nums2[ptr2]) {
                nums1[pMerge--] = nums1[ptr1--];

            } else {
                nums1[pMerge--] = nums2[ptr2--];
            }
        }


        return nums1;
    }


    public static int[] merge1(int[] nums1, int m, int[] nums2, int n) {
        int mEnd = m - 1;           // Last index of nums1's initial elements
        int nEnd = n - 1;           // Last index of nums2
        int totalLength = m + n - 1; // Last index of the merged array

        // Merge nums1 and nums2 from the end to the beginning
        while (mEnd >= 0 && nEnd >= 0) {
            if (nums1[mEnd] > nums2[nEnd]) {
                nums1[totalLength--] = nums1[mEnd--];
            } else {
                nums1[totalLength--] = nums2[nEnd--];
            }
        }

        // If there are any remaining elements in nums2, place them in nums1
        while (nEnd >= 0) {
            nums1[totalLength--] = nums2[nEnd--];
        }

        return nums1;
    }


}
