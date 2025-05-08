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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int quo = 0;
        ListNode ans = new ListNode();
        ListNode head = ans;
        while(l1 != null || l2 != null || quo != 0){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2 + quo;
            int val = sum % 10;
            quo = sum/10;

            ans.val = val;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

            if(l1 != null || l2 != null || quo != 0)
               ans.next = new ListNode();
            ans = ans.next;
        }

        return head;
    }
}