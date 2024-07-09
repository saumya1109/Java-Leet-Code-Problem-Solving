package ArrayAndStrings;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] array ={2,2,1,1,1,2,2};
        System.out.println(majorityElement(array));

    }

    public static int majorityElement(int[] nums) {
        int max=0;
        int key=0;

        Map<Integer, Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        System.out.println(map);

        for(Integer keys : map.keySet()) {
            if(map.get(keys)> max){
                max= map.get(keys);
                key = keys;
            }
        }
        return key;
    }
}