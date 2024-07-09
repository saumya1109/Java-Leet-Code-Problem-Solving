package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        System.out.println(hasCycle(head));
        System.out.println(floydWarshal(head));


    }

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> visitedNodes = new HashSet<>();


        while (head != null) {
            if (visitedNodes.contains(head)) {
                return true;
            }
            visitedNodes.add(head);
            head = head.next;

        }
        return false;

    }


    public static boolean floydWarshal(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}