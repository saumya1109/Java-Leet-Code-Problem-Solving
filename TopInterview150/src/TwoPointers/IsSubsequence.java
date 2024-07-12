package TwoPointers;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        //String s ="acb" ,t = "ahbgdc";
        //String s = "",t = "ahbgdc";
        //String s = "aaaaaa", t = "bbaaaa";
        System.out.println(isSubsequence(s, t));

    }

    public static boolean isSubsequence(String s, String t) {
        //Time complexity :O(n)
        if (s.length() == 0) return true;

        int ptr1 = 0;
        int ptr2 = 0;

        while (ptr2 != t.length()) {
            if (s.charAt(ptr1) != t.charAt(ptr2)) {
                ptr2++;
            } else {
                ptr1++;
                ptr2++;
            }
            if (ptr1 == s.length()) return true;
        }

        return false;

    }
}



