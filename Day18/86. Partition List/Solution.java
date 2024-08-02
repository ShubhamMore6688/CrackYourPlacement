class Solution {
    public ListNode partition(ListNode head, int x) {
        
        ListNode smallDummy = new ListNode(0);
        ListNode small = smallDummy;

        ListNode largeDummy = new ListNode(0);
        ListNode large = largeDummy;

        ListNode temp = head;


        while(temp != null){
            if(temp.val < x){
                small.next = temp;
                temp = temp.next;
                small = small.next;
                small.next = null;
            }else{
                large.next = temp;
                temp = temp.next;
                large = large.next;
                large.next = null;
            }
        }
        
        small.next = largeDummy.next;

        return smallDummy.next;


    }
}