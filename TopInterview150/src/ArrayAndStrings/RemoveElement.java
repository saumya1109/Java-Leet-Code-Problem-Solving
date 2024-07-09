package ArrayAndStrings;
public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {3, 2, 2, 3};
        int num = 3;

        int[] output = replaceNumber(array, num);


        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }
    }

    public static int[] replaceNumber(int[] input, int num) {
        int distinctCount = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == num) {
                for (int j = i + 1; j < input.length; j++) {
                    if (input[j] != num) {
                        int temp = input[i];
                        input[i] = input[j];
                        input[j] = temp;
                        break;
                    }
                }
            }
        }

        return input;
    }


}