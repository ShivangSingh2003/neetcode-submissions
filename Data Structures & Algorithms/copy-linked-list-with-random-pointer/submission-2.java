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
        if(head == null)
            return null;
        HashMap<Node, Node> mapper = new HashMap<>();
        Node dummy = new Node(-1);
        Node s = new Node(head.val);
        mapper.put(head, s);
        dummy.next = s;
        Node curr = null;

        while(head != null){
            if(!mapper.containsKey(head)){
                Node temp = new Node(head.val);
                mapper.put(head, temp);
            }
            curr = mapper.get(head);
            if(head.random == null){
                curr.random = null;
            }
            else if(mapper.containsKey(head.random)){
                curr.random = mapper.get(head.random);
            }
            else{
                Node randomTemp = new Node(head.random.val);
                curr.random = randomTemp;
                mapper.put(head.random, randomTemp);
            }
            if(head.next == null){
                curr.next = null;
            }
            else if(mapper.containsKey(head.next)){
                curr.next = mapper.get(head.next);
            }
            else{
                Node nextTemp = new Node(head.next.val);
                curr.next = nextTemp;
                mapper.put(head.next, nextTemp);
            }
            head = head.next;
        }
        return dummy.next;
    }
}
