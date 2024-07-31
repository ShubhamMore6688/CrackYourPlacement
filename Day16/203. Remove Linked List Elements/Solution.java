
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode prev = null;


        while(temp != null){

            if(temp.val == val){
                if(temp == head){
                    head = head.next;
                    temp = head;
                }else{
                    prev.next = temp.next;
                    temp = prev.next;
                }
            }else{
                prev = temp;
                temp =temp.next;
            }
        }


        return head;
    }
}