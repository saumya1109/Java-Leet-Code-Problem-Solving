    public class RemoveDuplicatesFromSortedList {
        public static void main(String[] args) {

            ListNode root = new ListNode(1);
            root.next = new ListNode(1);
            root.next.next = new ListNode(2);
            root.next.next.next = null;

            System.out.println((removeDuplicates(root)));

        }

        public static ListNode removeDuplicates(ListNode root) {
            // Get a pointer to the previous node
            // Get a pointer to the next node
            // Compare their values; if they are the same, shift the second pointer to the next unique node
            // Once a unique node is found, add the previous node's value to the dummy node
            // Move the first pointer to the position of the second pointer.
            // Move the second pointer one node to the right, if the node is not null.

            ListNode dummy = new ListNode(0);
            ListNode current = dummy;

            if (root != null && root.next == null) {
                current.next = root;
            }


            if (root != null && root.next != null) {
                ListNode prevNode = root;
                ListNode nextNode = root.next;

                while (prevNode != null && nextNode != null) {
                    if (prevNode.val == nextNode.val) {
                        nextNode = nextNode.next;
                    } else {
                        current.next = new ListNode(prevNode.val);
                        current = current.next;
                        prevNode = nextNode;
                        nextNode = nextNode.next;

                    }
                }
                if (nextNode == null) {
                    current.next = new ListNode(prevNode.val);
                }

            }
            return dummy.next;
        }
    }
