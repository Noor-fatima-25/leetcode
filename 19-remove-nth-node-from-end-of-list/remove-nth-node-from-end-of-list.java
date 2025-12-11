class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // dummy node to handle deletion of head safely
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        // Move first pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until first reaches end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // second.next is the node to remove
        second.next = second.next.next;

        return dummy.next; // new head
    }
}
