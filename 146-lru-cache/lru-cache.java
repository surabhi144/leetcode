class LRUCache {
    class Node{
        Node prev;
        Node next;
        int key;
        int value;

        Node(int key, int value){
            this.key = key;
            this.value = value;
            prev = null;
            next = null;
        }
    }
    Map<Integer, Node> map = new HashMap<>();
    int cap;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        cap = capacity;
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }

    public void deleteNode(Node node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    public void insertFront(Node node){
        //insert between head & next
        node.next = head.next;
        head.next.prev = node;

        head.next = node;
        node.prev = head;

        map.put(node.key, node);

        if(map.size() > cap){
            Node lru = tail.prev;
            map.remove(lru.key);
            deleteNode(lru);
        }
    }
    
    public int get(int key) {
        int ans = -1;
        if(map.containsKey(key)){
            Node node = map.get(key);
            ans = node.value;
            deleteNode(node);
            insertFront(node);
        }
        return ans;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            insertFront(node);
        }
        else{
            Node node = new Node(key, value);
            insertFront(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */