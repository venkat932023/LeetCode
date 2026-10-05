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
class Solution {
    public static int length(ListNode head) {
        int l = 0;
        ListNode t = head;
        while (t != null) {
            l++;
            t = t.next;
        }
        return l;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k==0) return head;
        int n = length(head);
        k = k % n;
        if (k==0) return head;
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 1; i <= k + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode a = slow.next;
        slow.next = null;
        ListNode temp = a;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;

        return a;

    }
}