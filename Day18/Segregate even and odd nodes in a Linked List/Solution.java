class Solution {
    Node divide(Node head) {
        // code here
         Node temp = head;
        Node oddDummy = new Node(0);
        Node odd = oddDummy;

        Node evenDummy = new Node(0);
        Node even = evenDummy;

        while(temp != null){
            if(temp.data % 2 == 0){
                even.next = temp;
                even = even.next;
                temp = temp.next;
                even.next = null;
            }else{
                odd.next = temp;
                odd = odd.next;
                temp = temp.next;
                odd.next = null;
            }
        }

        even.next = oddDummy.next;

        return evenDummy.next;
    }
}