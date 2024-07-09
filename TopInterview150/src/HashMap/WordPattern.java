package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat fish";
        boolean out = wordMatchesIndex(pattern, s);
        System.out.println(out);


    }

    public static boolean findWordPattern(String pattern, String s) {

        //using sets, but it won't allow pattern=abba ;string = dog dog dog dog
        //Splitted the string based on spaces
        String[] array = s.split(" ");

        Map<String, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        if (pattern.length() != array.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(array[i]) && !set.contains(pattern.charAt(i))) {
                map.put(array[i], pattern.charAt(i));
                set.add(pattern.charAt(i));
            } else if (map.containsKey(array[i])) {
                if (map.get(array[i]) == pattern.charAt(i)) {
                    continue;
                }
            } else {
                return false;
            }
        }

        return true;

    }

    public static boolean wordMatchesIndex(String pattern, String s) {

        String[] array = s.split(" ");

        if (pattern.length() != array.length) return false;

        //TODO simplify it by taking char and word in a variable to make it more readable...

        Map<Character, String> charToString = new HashMap<>();
        Map<String, Character> stringToChar = new HashMap<>();

        for (int i = 0; i < array.length; i++) {

            if (!charToString.containsKey(pattern.charAt(i))) {
                charToString.put(pattern.charAt(i), array[i]);
            }

            if (!stringToChar.containsKey(array[i])) {
                stringToChar.put(array[i], pattern.charAt(i));
            }

            if ((!charToString.get(pattern.charAt(i)).equals(array[i])) ||
                    (!stringToChar.get(array[i]).equals(pattern.charAt(i)))) {
                return false;

            }
        }

        return true;
    }
}