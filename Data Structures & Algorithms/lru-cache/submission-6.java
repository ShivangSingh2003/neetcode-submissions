class LRUCache {
    HashMap<Integer, ListNode> map;
    ListNode head;
    ListNode tail;
    int capacity;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        head = null;
        tail = null;
        this.capacity = capacity;
    }
    
    public int get(int key) {
        ListNode curr = map.get(key);
        if(curr == null) return -1;
        if(curr == tail) return curr.value;
        if(head == curr){
            head = head.next;
            head.prev = null;
        }
        
        if(curr.prev != null) curr.prev.next = curr.next;
        if(curr.next != null) curr.next.prev = curr.prev;
        tail.next = curr;
        curr.prev = tail;
        curr.next = null;
        tail = curr;
        return curr.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            get(key);
            tail.value = value;
        }
        else{
            if(this.capacity != 0){
                this.capacity --;
                ListNode newNode = new ListNode(key, value);
                if(head == null){
                    head = newNode;
                    tail = newNode;
                }
                else{
                    tail.next = newNode;
                    newNode.prev = tail;
                    tail = newNode;
                }
                map.put(key, newNode);
            }
            else{
                ListNode temp = head;
                map.remove(temp.key);
                head = head.next;
                if(head!=null) head.prev = null;
                temp.next = null;
                ListNode newNode = new ListNode(key, value);
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
                map.put(key, newNode);
            }
        }
    }
}

class ListNode{
    int key;
    int value;
    ListNode(int key, int value){
        this.key = key;
        this.value = value;
    }
    ListNode prev = null;
    ListNode next = null;
}
