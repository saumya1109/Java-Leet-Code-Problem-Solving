package Stack;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String path1 = "/home//foo/";
        //stack top-->foo/home    op: /home/foo

        String path2 = "/home/";
        //stack top--> home       op:/home

        String path3 = "/home/user/Documents/../Pictures";
        //stack-->    Pictures/../Documents/user/home       op: /home/user/(pop)Documents/..(pop)/Pictures

        String path4 = "/../";
        //stack top--> ..  op: /

        String path5 = "/.../a/../b/c/../d/./";
        /*Brute force wat is to move one character
        incrementally but this way we need to keep track of the elements we already traversed*

        /Since while traversing we need to come back that makes it ideal to implement stack
        LIFO -->

         */
        System.out.println(simplifyPath(path1));
        System.out.println(simplifyPath(path2));
        System.out.println(simplifyPath(path3));
        System.out.println(simplifyPath(path4));
        System.out.println(simplifyPath(path5));

    }

    public static String simplifyPath(String path) {
        String output = "";
        String[] tokens = path.split("/");
        Stack<String> stack = new Stack<>();

        if (tokens.length != 0) {
            for (int i = 0; i < tokens.length; i++) {
                if (!tokens[i].isEmpty() && tokens[i] != null) {
                    //push for characters
                    //don't do anything for .
                    // pop for ..

                    if (tokens[i].equals(".")) {
                        continue;
                    } else if (tokens[i].equals("..")) {
                        if (!stack.isEmpty()) {
                            stack.pop();
                        }
                    } else {
                        stack.push(tokens[i]);
                    }
                }
            }
        }
        while (!stack.isEmpty()) {
            output = "/" + stack.pop() + output;
        }


        return output.length() == 0 ? "/" : output;
    }
}
