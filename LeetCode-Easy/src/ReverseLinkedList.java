public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next= new ListNode(3);
        head.next.next.next= new ListNode(4);
        head.next.next.next.next= new ListNode(5);
        head.next.next.next.next.next=null;

        System.out.println(reverseLinkedList(head));
    }

    public static ListNode reverseLinkedList(ListNode head){
        if(head==null){
            return null;
        }

        ListNode  prev = null;
        ListNode current = head;

        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev = current;
            current = next;
        }
        head= prev;
        return head;
    }
}
