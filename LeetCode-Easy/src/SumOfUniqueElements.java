import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,2,2};
        int[] nums2 = {1,1,1,1,1};
        int[] nums3 = {1,2,3,4,5};

        System.out.println(findSum(nums1));
        System.out.println(findSum(nums2));
        System.out.println(findSum(nums3));


    }

    public static int findSum(int[] nums){

    Map<Integer,Integer> map = new HashMap<>();
    for(int n: nums){
        map.put(n,map.getOrDefault(n,0)+1);
    }

        int sum=0;
    for(Map.Entry<Integer,Integer> pair: map.entrySet()){

        if(pair.getValue()<2){
            sum+= pair.getKey();
        }
    }
        return sum;
    }
}
