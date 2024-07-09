package BinaryTreeGeneral;
import java.util.LinkedList;
import java.util.Queue;

public class PopulatingRightMostPointersInTreeNode {
    public static void main(String[] args){

        Node root= new Node(1);
        root.left= new Node(2);
        root.right = new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.right = new Node(7);

        populate(root);

    }

    public static Node populate(Node root) {
    // For BFS or level order traversal the best data structure to use us Queue:

        //Base Case
        // if root is null then we should return null;

        if(root== null) return null;

        //Initialise a queue which holds the value with linkedList and add the root
        Queue<Node> q= new LinkedList<>();
        q.add(root);

        //Loop till the queue is not empty
        while(!q.isEmpty()) {

            int size = q.size();
            Node dummy = new Node(0);
            while(size-- >0) {

                Node node = q.remove();
                dummy.next= node;
                dummy = dummy.next;

                if(node.left!=null) {
                    q.add(node.left);

                }

                if(node.right!=null) {
                    q.add(node.right);

                }


            }

        }

        return root;
    }
}