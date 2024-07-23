package ArrayAndStrings;

public class RotateArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        int[] array2 = {-1, -100, 3, 99};
        int k2 = 2;
        int[] array3 = {1, 2};
        int k3 = 3;

        rotate(array1, k1);

        for (int n : array1) {
            System.out.print(n + " ");
        }


        System.out.println();
        rotate(array2, k2);

        for (int n : array2) {
            System.out.print(n + " ");
        }

        System.out.println();
        rotate(array3, k3);

        for (int n : array3) {
            System.out.print(n + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        //Handle cases where k is greater than the length of the array
        k = k % nums.length;

        // Reverse the entire array
        rotateArray(nums, 0, nums.length - 1);

        // Reverse the first k elements
        rotateArray(nums, 0, k - 1);

        // Reverse the rest of the array
        rotateArray(nums, k, nums.length - 1);


    }

    public static int[] rotateArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }


}
