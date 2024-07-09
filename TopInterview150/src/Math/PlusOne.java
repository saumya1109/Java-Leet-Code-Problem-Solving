package Math;

public class PlusOne {
    public static void main(String[] args) {
        int[] array = {9, 9};
        int[] output = plusOne(array);

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }


    }

    public static int[] plusOne(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] + 1 < 9) {
                arr[i]++;
                return arr;
            } else {
                arr[i] = 0;
            }

        }
        int[] output = new int[arr.length + 1];
        output[0] = 1;
        return output;
    }
}