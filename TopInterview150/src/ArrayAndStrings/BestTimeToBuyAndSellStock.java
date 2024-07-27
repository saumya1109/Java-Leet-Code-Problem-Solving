package ArrayAndStrings;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int [] prices1 = {7,1,5,3,6,4};
        int[]  prices2={2,4,1};
        System.out.println(findBestProfit(prices1));
        System.out.println(findBestProfit(prices2));
    }

    private static int findBestDay(int[] prices){

        // This approach will result into time exceed if the array is very large
        int maxProfit=0;
        for(int i=0;i< prices.length-1;i++){
            for(int j=i+1;j< prices.length;j++){
                if(prices[j]-prices[i]>0 && prices[j]-prices[i]> maxProfit){
                    maxProfit= prices[j]-prices[i];
                }
            }
        }

        return maxProfit;
    }

    private static int findBestProfit(int[] prices){
        int min= Integer.MAX_VALUE;
        int profit=0;

        for(Integer n: prices){
            if(n < min){
                min=n;
            }else if(n-min > profit){
                profit= n-min;
            }
        }

        return profit;
    }



}
