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
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            sb.append(Integer.toString(temp.val));
            temp = temp.next;
        }
        if(sb.toString().equals(new StringBuilder(sb).reverse().toString()))
         return true;
        return false; 
    }
}