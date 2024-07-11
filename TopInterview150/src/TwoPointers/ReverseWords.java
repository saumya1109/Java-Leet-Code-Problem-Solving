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
        // Convert the string to a character array
        char[] str = s.toCharArray();
        int n = str.length;

        // Reverse the entire string
        reverse(str, 0, n - 1);

        // Reverse each word in the reversed string
        reverseWords(str, n);

        // Clean up spaces and construct the final result
        return cleanSpaces(str, n);
    }

    private static void reverse(char[] str, int left, int right) {
        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }

    private static void reverseWords(char[] str, int n) {
        int start = 0, end = 0;

        while (start < n) {
            while (start < end || (start < n && str[start] == ' ')) start++;
            while (end < start || (end < n && str[end] != ' ')) end++;
            reverse(str, start, end - 1);
        }
    }

    private static String cleanSpaces(char[] str, int n) {
        int i = 0, j = 0;

        while (j < n) {
            while (j < n && str[j] == ' ') j++;
            while (j < n && str[j] != ' ') str[i++] = str[j++];
            while (j < n && str[j] == ' ') j++;
            if (j < n) str[i++] = ' ';
        }

        return new String(str).substring(0, i);
    }
}
