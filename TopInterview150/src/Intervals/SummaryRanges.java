package Intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        int[] nums1 ={0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));
        System.out.println(summaryRanges(nums1));


    }
    public static List<String> summaryRanges(int[] nums) {
        List<String>  output = new ArrayList<>();
        int startValue = nums[0];
        int value = startValue;


        for(int i=1;i< nums.length;i++){
            if(value+1 == nums[i]){
                value= nums[i];

            }
            else {
                StringBuilder sb = new StringBuilder();
                if (startValue == value) {
                    sb.append(startValue); // Single number range
                } else {
                    sb.append(startValue).append("->").append(value); // Multi-number range
                }

                output.add(sb.toString());

                startValue= nums[i];
                value = startValue;
            }



        }

        StringBuilder sb = new StringBuilder();
        if (startValue == value) {
            sb.append(startValue); // Single number range
        } else {
            sb.append(startValue).append("->").append(value); // Multi-number range
        }
        output.add(sb.toString());
        return output;
    }
}
