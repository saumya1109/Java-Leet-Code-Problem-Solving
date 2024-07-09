package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1};
        System.out.println(containsDuplicate(array));


    }
//First Trial
    public static boolean containsDuplicate(int[] input) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            map.put(input[i], map.getOrDefault(input[i], 0) + 1);
        }


        for (Integer keys : map.keySet()) {
            if (map.get(keys) > 1) {
                return false;
            }
        }


        return true;
    }

    //Improved version
    public static boolean containsDuplicatewithHashSet(int[] input) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i< input.length;i++) {
            if(!set.contains(input[i])) {
                set.add(input[i]);
            }else{
                return true;
            }

        }

        return false;
    }


}