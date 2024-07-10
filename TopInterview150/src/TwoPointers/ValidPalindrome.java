package TwoPointers;

import java.util.Stack;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2="race a car";
        String s3=" ";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));



    }

    public static boolean isPalindrome(String s){
        //O(n)
        if(s.isEmpty()) return true;
        s=s.replaceAll("[\\p{Punct}\\s]","").toLowerCase();
        int left= 0;
        int right= s.length()-1;

        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left+=1;
            right-=1;
        }
        return true;
    }

    public static boolean isPalindromeWithStack(String s) {
        if (s.isEmpty()) return true;

        s = s.replaceAll("[\\p{Punct}\\s]", "");
        String originalString = s.toLowerCase();
        String reverseString = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < originalString.length(); i++) {
            stack.push(originalString.charAt(i));
        }

        while (!stack.isEmpty()) {
            reverseString += stack.pop();
        }

        if (!reverseString.equals(originalString)) {
            return false;
        }

        return true;

    }
}
