import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterString {
    public static void main(String[] args) {
        String s = "leetcode";
        String s1 = "loveleetcode";
        String s2 = "aabb";

        System.out.println(firstUniqChar(s));
        System.out.println(firstUniqChar(s1));
        System.out.println(firstUniqChar(s2));
    }


    public static int firstUniqCharBF(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        }
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar(String s){
        if(s.length()==0) return -1;

        int[] alphabets = new int[26];


        //mapping of the character to how many times do they appear?
        for(int i=0;i< s.length();i++){
            char ch = s.charAt(i);
            alphabets[ch-'a']++;
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(alphabets[ch-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
