package Stack;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        //String s = "()";
       //String s = "[{}()]";
       // String s = "(]";
       // String s="(){}}{";
        String s = "]";
        System.out.println( checkValid(s));

    }

    public static boolean checkValid(String s) {


        Stack<Character> stack = new Stack<>();
        for(int i=0;i< s.length();i++) {
            char bracket = s.charAt(i);

            if(bracket =='('){
                stack.push(')');
            }else if(bracket=='['){
                stack.push(']');
            }
            else if(bracket=='{'){
                stack.push('}');
            }
            else if(stack.isEmpty() || stack.pop()!= bracket) {
                return false;
            }


        }

        return stack.isEmpty();
    }
}