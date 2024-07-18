package ArrayAndStrings;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        //int target=0;
        //int target=2;

        System.out.println(findPositionBF(nums, target));

    }


    public static int findPositionBF(int[] nums, int target){
        //O(n)
        for(int i=0;i< nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

 // ToDO: solve it with Binary Search  O(n logn)
}

