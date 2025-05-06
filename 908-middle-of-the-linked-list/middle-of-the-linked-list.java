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
    public ListNode middleNode(ListNode head) {
        ListNode root = head;
        int len = 0;
        while(root != null){
            root = root.next;
            len++;
        }
        int node = len/2 + 1;
        len = 0;
        while(head != null){
            len++;
            if(len == node)
             return head;
            head = head.next;
        }
        return null;
    }
}