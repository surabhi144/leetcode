/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        while(node != null){
            ListNode temp = node.next;
            if(temp != null){
                node.val = temp.val;
                if(temp.next == null )
                node.next = null;
            }
            node = node.next;
        }
    }
}