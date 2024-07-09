package HashMap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        String a = "ba";
        String b = "baa";

        System.out.println(canConstruct(a, b));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            ransomMap.put(ransomNote.charAt(i), ransomMap.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }


        for (int i = 0; i < magazine.length(); i++) {
            magazineMap.put(magazine.charAt(i), magazineMap.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (Character key : ransomMap.keySet()) {
            if (!magazineMap.containsKey(key) || ransomMap.get(key) > magazineMap.get(key)) {
                return false;
            }
        }

        return true;
    }
}