package HashMap;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));


    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List <String>> output= new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String token : strs) {
            String key = findKey(token);
            List<String> values = map.get(key);
            if (values == null) {
                values = new ArrayList<String>();
                map.put(key, values);
            }
            values.add(token);
        }

        for(List<String> outStream :map.values()){
            output.add(outStream);
        }
        return output;
    }

    public static String findKey(String token) {
        char[] charArray = token.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static String findKeyUsingCountOfLetters(String token){
        Map<Character,Integer> map= new LinkedHashMap<>();
        char[] charArray = token.toCharArray(); // Convert string to char array
        Arrays.sort(charArray); // Sort the char array
        token=  new String(charArray);

        for(int i=0;i< token.length();i++){
            char letter=token.charAt(i);
            map.put(letter, map.getOrDefault(letter,0)+1);

        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry entry : map.entrySet()){
            sb.append(entry.getKey()).append(entry.getValue());
        }
        return sb.toString();
    }
}
