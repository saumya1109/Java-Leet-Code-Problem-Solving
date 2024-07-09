package ArrayAndStrings;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String input = "IX";
        // String input = "III";
        //String input = "MCMXCIV";


        System.out.println(romanToInteger(input));

        //Time Complexity : O(n)
        //Space Complexity :O(1)

    }

    public static int romanToInteger(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] romanArray = input.toCharArray();
        int sum = 0;
        int length = romanArray.length;
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        for (int i = 0; i < length; i++) {
            if (i < length - 1 && map.get(romanArray[i]) < map.get(romanArray[i + 1])) {
                sum = sum - map.get(romanArray[i]);
            } else {
                sum = sum + map.get(romanArray[i]);
            }
        }

        return sum;


    }
}
