package ArrayAndStrings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String[] strs1 ={"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs1));


    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String output="";
        String firstValue = strs[0];


        int index=0;
        while(index< strs[0].length()) {
            char currentChar = firstValue.charAt(index);

            for (int i = 0; i < strs.length; i++) {
                char ch = strs[i].charAt(index);
                if (ch == currentChar) {
                    continue;
                }
                else{
                   return output ;
                }

            }
            output += currentChar;
            index++;
        }
       return output;


    }

}
