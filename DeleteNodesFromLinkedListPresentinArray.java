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
class DeleteNodesFromLinkedListPresentinArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int numbers : nums) { set.add(numbers); }

        while (set.contains(head.val)) { head = head.next; }

        ListNode slow = head;
        ListNode fast = slow.next;
        while (fast != null) {
            if (set.contains(fast.val)) {
                slow.next = fast.next;
                fast = fast.next;
            } else {
                slow = fast;
                fast = fast.next;
            }
        }
        return head;
    }
}
