import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
      //  System.out.println(compressBF(chars));
     //   System.out.println(compressBF(chars).length());
        System.out.println(compress(chars));

    }

    public static String compressBF(char[] chars) {
        Map<Character, Integer> map = new HashMap<>();
        String output = "";

        for (Character c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entries : map.entrySet()) {
            output += entries.getKey() + "" + entries.getValue();
        }
        return output;

    }


    public static char[] compress(char[] chars) {

        int i = 0;

        char current_char = chars[0];
        int index = 0;

        while (i < chars.length) {
            current_char = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == current_char ) {
                i++;
                count++;
            }
            chars[index++] = current_char;

            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }



        }

        return chars;

    }
}
