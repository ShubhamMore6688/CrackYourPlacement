class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;

        while(temp != null){
            Node newnode = new Node(temp.val);
            newnode.next = temp.next;
            temp.next = newnode;
            temp = newnode.next;
        }


        temp = head;

        while(temp != null){
            if(temp.random != null){
                temp.next.random = temp.random.next;
            }

            temp = temp.next.next;
        }

        temp = head;
        Node newHead = head.next;
        Node newCurr = newHead;

        while(temp != null){
            temp.next = temp.next.next;
            if(newCurr.next != null){
                newCurr.next = newCurr.next.next;
            }

            temp = temp.next;
            newCurr  = newCurr.next;
        }

        return newHead;
    }
}