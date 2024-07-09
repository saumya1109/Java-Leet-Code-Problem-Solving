package ArrayAndStrings;

public class LengthOfLastWord {
    public static void main(String[] args) {
       // String input = "Hello World";
        String input = "   fly me   to   the moon  ";
        System.out.println(calculate(input));

        System.out.println(calculateFromLast(input));

    }

    public static int calculate(String s) {

        // Time complexity for this solution is: O(n)
        String[] StringArray = s.split(" ");
        String output = StringArray[StringArray.length - 1];

        return output.length();
    }

    public static int calculateFromLast(String s) {
        s = s.trim();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ' && Character.isLetter(s.charAt(i))) {
                count++;
            }
            if (s.charAt(i) == ' ') {
                break;
            }
        }

        return count;
    }
}