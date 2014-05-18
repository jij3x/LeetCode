/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head != null) {
            for (ListNode pivot = head; pivot.next != null;) {
                if (pivot.val == pivot.next.val)
                    pivot.next = pivot.next.next;
                else
                    pivot = pivot.next;
            }
        }
        return head;
    }
}
