class Node{
    public int key;
    public int val;
    public Node next;
    public Node prev;

    public Node(int key, int val){
        this.key = key;
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
class LRUCache {

    Map<Integer, Node> m;
    int size;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        size = capacity;
        m = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public void deletNode(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public void addNode(Node node){
        Node temp = head.next;
        head.next = node;
        node.next = temp;
        node.prev = head;
        temp.prev = node;
    }
    
    public int get(int key) {
        if(!m.containsKey(key)){
            return -1;
        }

        Node p = m.get(key);
        deletNode(p);
        addNode(p);
        m.put(key, head.next);
        return head.next.val;
    }
    
    public void put(int key, int value) {
        if(m.containsKey(key)){
            Node c = m.get(key);
            deletNode(c);
            c.val = value;
            addNode(c);
            m.put(key, head.next);
        }else{
            if(m.size()==size){
                Node prev = tail.prev;
                deletNode(prev);
                Node newnode = new Node(key, value);
                addNode(newnode);
                m.remove(prev.key);
                m.put(key, head.next);
            }else{
                Node newnode = new Node(key, value);
                addNode(newnode);
                m.put(key, head.next);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */