package HashMap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";

        System.out.println(isIsomorphic(s, t));

    }

    public static boolean isIsomorphic(String s, String t) {

        //e-->a     g--> d    egg->add   true
        //f-->b     o-->b     o-->r (can't be possible as o is already pointing to b)  false
        //p --> t   a--i     p--> t e-->l   r-->e

        Map<Character, Character> map = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (!map.containsValue(t.charAt(i)))
                    map.put(s.charAt(i), t.charAt(i));
                else
                    return false;
            }
            else {
                char mappedCharacter = map.get(s.charAt(i));
                if (mappedCharacter != t.charAt(i))
                    return false;
            }
        }



        return true;


    }
}