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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode head = res;
        ListNode a = list1;
        ListNode b = list2;
        while(a!= null && b!=null){
            if(a.val < b.val){
                res.next = new ListNode(a.val);
                a = a.next;
                res = res.next;
            }
            else{
                res.next = new ListNode(b.val);
                b = b.next;
                res = res.next;
            }
        }
        while(a!=null){
            res.next = new ListNode(a.val);
            a = a.next;
            res = res.next;
        }
        while(b!=null){
            res.next = new ListNode(b.val);
            b = b.next;
            res = res.next;
        }
        return head.next;
    }
}