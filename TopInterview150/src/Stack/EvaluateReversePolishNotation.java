package Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        // String[] array = {"2", "1", "+", "3", "*"};
        //  String [] array ={"4","13","5","/","+"};
        String[] array = {"18"};

        System.out.println(getReversePolishNotation(array));
    }

    public static int getReversePolishNotation(String[] array) {
        Stack<String> stack = new Stack<>();
        long result = 0;
        for (int i = 0; i < array.length; i++) {
            String input = array[i];
            if (!stack.isEmpty() && input.equals("+") || input.equals("-") || input.equals("*")
                    || input.equals("/")) {

                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());

                if (input.equals("+")) {
                    result = num1 + num2;
                } else if (input.equals("-")) {
                    result = num2 - num1;
                } else if (input.equals("*")) {
                    result = num1 * num2;
                } else if (input.equals("/")) {
                    if (num1 != 0) {
                        result = num2 / num1;
                    } else {
                        result = -1;
                    }
                }

                stack.push(String.valueOf(result));
            } else {
                stack.push(input);
            }

        }

        return Integer.parseInt(stack.pop());
    }
}