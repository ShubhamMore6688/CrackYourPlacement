class Solution {
    public ListNode reverseList(ListNode head){

        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode prev = null;
        ListNode front = null;

        while(temp != null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }
    public void reorderList(ListNode head) {
      
      if(head == null || head.next == null) return;

      ListNode slow = head;
      ListNode fast = head;


      while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
      }


      ListNode second = reverseList(slow.next);
      slow.next = null;

      ListNode first = head;

      while(second != null){
        ListNode temp1 = first.next;
        ListNode temp2 = second.next;

        first.next = second;
        second.next = temp1;

        first = temp1;
        second = temp2;
    
      }
    }
}