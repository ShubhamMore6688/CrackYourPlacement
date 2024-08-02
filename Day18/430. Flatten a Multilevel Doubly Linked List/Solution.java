class Solution {
    public void flattenlinkedlist(Node head, ArrayList<Integer> list){
        if(head == null) return ;
        Node temp = head;

        while(temp != null){
            list.add(temp.val);

            if(temp.child != null){
                flattenlinkedlist(temp.child, list);
            }

            temp = temp.next;

        }
    
    }

    public Node flatten(Node head) {

        if(head == null) return head;
        ArrayList<Integer> list = new ArrayList<>();
        flattenlinkedlist(head, list);

        Node dummy = new Node(0);
        Node temp = dummy;

        Node prevnode = null;
        for(int i=0; i<list.size(); i++){

            Node newnode = new Node(list.get(i));
            temp.next = newnode;
            newnode.prev = temp;
            temp = temp.next;
        }

        dummy.next.prev = null;
        return dummy.next;
        

        
    }
}