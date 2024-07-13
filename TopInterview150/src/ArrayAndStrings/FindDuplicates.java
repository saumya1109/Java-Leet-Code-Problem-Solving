package ArrayAndStrings;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 6, 7};
        int[] arr2 = {3, 6, 7, 8, 20};

        System.out.println(findDuplicates(arr1,arr2));
    }


    public static int[] findDuplicates(int[] arr1, int[] arr2) {

        Set<Integer> set1 =  new LinkedHashSet<>();
        Set<Integer> set2 =  new LinkedHashSet<>();

        for(int i=0;i<arr1.length;i++ ){
            set1.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++ ){
            set2.add(arr2[i]);
        }

        set1.retainAll(set2);
        return new int[]{};

    }

}
