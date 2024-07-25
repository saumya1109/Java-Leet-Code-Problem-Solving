import java.util.Arrays;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        int[] prices1 = {3, 2, 3};
        int money1 = 3;
        int[] prices2 = {1, 2, 2};
        int money2 = 3;
        int[] prices3 = {98, 54, 6, 34, 66, 63, 52, 39};
        int money3 = 62;

        System.out.println(money(prices1, money1));
        System.out.println(money(prices2, money2));
        System.out.println(money(prices3, money3));
    }

    public static int money(int[] prices, int money) {
        int temp = money;
        Arrays.sort(prices);
        for (int i = 0; i < 2; i++) {
            money -= prices[i];

        }
        if (money >= 0) {
            return money;
        }

        return temp;
    }
}
