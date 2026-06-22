/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        Map<Node, Node> map = new HashMap<>();
        while(temp != null){
            Node node = new Node(temp.val);
            map.put(temp, node);
            temp = temp.next; 
        }

        temp = head;
        while(temp != null){
            Node random = temp.random;
            Node next = temp.next;
            Node curr = map.get(temp);
            curr.next = map.get(next);
            curr.random = map.get(random);

            temp = temp.next; 
        }
        return map.get(head);
    }
}