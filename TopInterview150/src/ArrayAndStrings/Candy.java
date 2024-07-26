package ArrayAndStrings;

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        int[] ratings1 = {1, 0, 2};
        int[] ratings2= {1,2,2};
        int[] ratings3 ={1,3,4,5,2};
        int[] ratings4={1,3,2,2,1};

        System.out.println(findCandyBasedOnRatings(ratings1));
        System.out.println(findCandyBasedOnRatings(ratings2));
        System.out.println(findCandyBasedOnRatings(ratings3));
        System.out.println(findCandyBasedOnRatings(ratings4));

    }

    public static int findCandyBasedOnRatings(int[] ratings) {
        int length = ratings.length;
        int sum = 0;

        //Make a new temporary array that will be initilaized to 1. as we need to give atleast one candy to everyone
        int[] temp = new int[length];
        Arrays.fill(temp,1);

        //Left-->Right
        for(int i=1;i<length;i++){
            if(ratings[i]> ratings[i-1]) {
                temp[i] = temp[i-1] +1;
            }
        }
        //Right<--Left
        for(int i= length-1; i>=1;i--){
            if(ratings[i-1] > ratings[i] && (temp[i-1]<= temp[i])){
                temp[i-1]= temp[i]+1;
            }
        }

        // summing up the values in temp array
        for (int num : temp) {
            sum += num;
        }

        return sum;
    }
}
