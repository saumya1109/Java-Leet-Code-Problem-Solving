package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        String s1 = "the sky is blue";
        System.out.println(reverseWords(s1));

        String s2 = "  hello world  ";
        System.out.println(reverseWords(s2));

        String s3 = "a good   example";
        System.out.println(reverseWords(s3));

        System.out.println(reverseWordsWithTwoPointers(s3));
    }


    public static String reverseWords(String s) {
        /*First thoughts :
         * Tokenise and use stack as the questions just ask to return LIFO
         * However this take O(n) time and space complexity*/

        String[] tokens = s.split(" ");

        String output = "";
        Stack<String> stack = new Stack<>();

        if (tokens.length != 0) {
            for (int i = 0; i < tokens.length; i++) {
                if (!tokens[i].isEmpty()) {
                    stack.push(tokens[i]);
                }
            }
        }

        while (!stack.isEmpty()) {
            output += stack.pop() + " ";
        }


        return output.trim();

    }

    public static String reverseWordsWithTwoPointers(String s) {
      //todo

        return "";
    }
}
