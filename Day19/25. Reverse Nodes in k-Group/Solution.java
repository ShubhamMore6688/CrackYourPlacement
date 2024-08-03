class Solution {
    public ListNode reverseLinkedlist(ListNode head){
        if(head == null || head.next == null) return head;  
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }

    public ListNode kgroup(ListNode head, int k){
        k-=1;
        ListNode temp = head;

        while(temp != null && k>0){
            k--;
            temp = temp.next;
        }

        return temp;
        
    }


    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode prev = null;
        ListNode next = null;

        while(temp != null){
            ListNode kthnode = kgroup(temp, k);

            if(kthnode == null){
                if(prev != null){
                    prev.next = temp;
                }
                break;
            }

            next = kthnode.next;
            kthnode.next = null;
            reverseLinkedlist(temp);


            if(temp == head){
                head = kthnode;
            }else{
                prev.next = kthnode;
            }

            prev = temp;
            temp = next;

        }

        return head;

    }
}