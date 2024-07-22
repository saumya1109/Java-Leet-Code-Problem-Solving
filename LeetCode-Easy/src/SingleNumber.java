import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums1 = {2,2,1};
        int[] nums2 ={4,1,2,1,2};
        System.out.println(findSingleNumberBF(nums1));
        System.out.println(findSingleNumberBF(nums2));
        System.out.println(findSingleNumberUsingMap(nums1));
        System.out.println(findSingleNumberUsingMap(nums2));
        System.out.println(optimisedWay(nums1));
        System.out.println(optimisedWay(nums2));

    }

    public static int findSingleNumberBF(int[] nums){
        //Time Complexity : O(n2)
        /*
         - take one element from nums array
         - compare it to every element in the array
         - if(count is more than 1 go to next element)
         - else return the number with count as 1
        */
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j< nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }

        }
        return 0;
    }

    public static int findSingleNumberUsingMap(int[] nums){
        /*
        * Using maps can help checking the value faster against a key
        * Populate the map with the values present in array
        * Return key whose value is one
        * */
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> valuePairs : map.entrySet()){
            if(valuePairs.getValue()==1){
                return valuePairs.getKey();
            }
        }
        return 0;
    }


    public static int optimisedWay(int[] nums){
        /*
         -Using the XOR operation, you can find the single number in linear time O(n) and constant space O(1).
         - 1^1 =0        1^0 =1
         -XOR-ing a number with itself results in 0
          XOR-ing a number with 0 results in the number itself
          all paired numbers will cancel out, leaving only the single number.

        * */
        int singleNumber=0;

        for(int i=0;i< nums.length;i++){

            singleNumber= singleNumber^nums[i];
        }

        return singleNumber;
    }
}

