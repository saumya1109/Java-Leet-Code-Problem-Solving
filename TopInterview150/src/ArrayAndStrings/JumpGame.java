package ArrayAndStrings;

public class JumpGame {
    public static void main(String[] args) {

       int[] nums = {2,3,1,1,4};
       int[] nums1={3,2,1,0,4};
       int[] nums2={1,1,2,5,2,1,0,0,1,3};

        System.out.println( testJump(nums));
        System.out.println( testJump(nums1));
        System.out.println(testJump(nums2));



    }
    public static boolean testJump(int[] nums){
        int lastIndex = nums.length-1;

        for(int i=lastIndex-1;i>=0;i--){
           if(i+nums[i]>= lastIndex){
               lastIndex=i;
           }
        }
        return lastIndex==0;
    }
}
