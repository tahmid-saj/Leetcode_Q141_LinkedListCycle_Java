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
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || (head.next == null)) {
            return false;
        }

        ListNode tortoise = head, hare = head;

        while (tortoise != null && hare != null) {
            tortoise = tortoise.next;
            if (hare.next != null) {
                hare = hare.next.next;
            } else {
                return false;
            }

            if (tortoise == hare) {
                return true;
            }
        }

        return false;
    }
}
