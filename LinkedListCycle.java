/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) { return false; }
        ListNode hare = head;
        ListNode tort = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tort = tort.next;
            if (hare == tort) { return true; }
        }
        return false;
    }
}
