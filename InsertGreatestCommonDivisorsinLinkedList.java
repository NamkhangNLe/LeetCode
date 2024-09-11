/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class insertGreatestCommonDivisors {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        while (curr != null) {
            ListNode gcd = new ListNode(gcd(prev.val, curr.val), curr);
            prev.next = gcd;
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
}
