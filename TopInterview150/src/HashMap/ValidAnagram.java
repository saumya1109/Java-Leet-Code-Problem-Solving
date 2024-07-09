package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
       String s = "anagram", t = "nagaram";
       //String s = "rat", t = "car";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;

        Map<Character, Integer> sMap = new HashMap<>();

        for(int i=0;i<s.length();i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0)+1);
        }


        for(int i=0;i<t.length();i++) {
            sMap.put(t.charAt(i), sMap.getOrDefault(t.charAt(i),0)-1);
        }


        for (int val : sMap.values()) {
            if (val != 0) {
                return false;
            }
        }


        return true;

    }
}
