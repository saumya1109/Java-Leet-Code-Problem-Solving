public class MergeTwoSortedList {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = null;

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        l2.next.next.next = null;

        mergeLists(l1, l2);
    }


    public static ListNode mergeLists(ListNode l1, ListNode l2) {

                /* Create a dummy node and create a pointer current that
                        helps to move and put the elements in  */
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;


        while (l1 != null && l2 != null) {
           // Compare elements and add the smaller one to the new list
            if (l1.val < l2.val) {
                current.next = new ListNode(l1.val);
                current = current.next;
                l1 = l1.next;

            } else if (l2.val < l1.val) {
                current.next = new ListNode(l2.val);
                current = current.next;
                l2 = l2.next;

            } else if (l1.val == l2.val) {
                // Handle equal values by adding both
                current.next = new ListNode(l1.val);
                current = current.next;
                current.next = new ListNode(l2.val);
                current = current.next;
                l1 = l1.next;
                l2 = l2.next;

            }
        }

        // Append remaining elements if lists are of different lengths
        if (l1 == null) {
            current.next = l2;
        } else if (l2 == null) {
            current.next = l1;
        }

        //Return the merged list starting from dummy.next
        return dummy.next;
    }
}
