import java.util.ArrayList;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(6);
        arr.add(5);
        arr.add(3);
        arr.add(3);
        arr.add(1);


        System.out.println(pickingNumbers(arr));
    }

    public static int pickingNumbers(List<Integer> a) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int count = 0;
            for (int j = 1; j < a.size(); j++) {
                if (Math.abs(a.get(j) - a.get(i)) <= 1) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

}
