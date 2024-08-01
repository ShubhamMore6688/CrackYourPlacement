class Solution {
    
    public ListNode reverseList(ListNode head){
 
         if(head == null || head.next == null) return head;
         ListNode temp = head;
         ListNode prev = null;
         
 
         while(temp != null){
             ListNode front = temp.next;
             temp.next = prev;
             prev = temp;
             temp = front;
         }
 
         return prev;
     }
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         
        
         l1 = reverseList(l1);
         l2 = reverseList(l2);
 
         ListNode dummy = new ListNode(0);
         ListNode current = dummy;
 
         int carray = 0;
 
         while(l1 != null || l2 != null || carray != 0){
             int sum = carray;
 
             if(l1 != null){
                 sum += l1.val;
                 l1 = l1.next;
             }
 
             if(l2 != null){
                 sum += l2.val;
                 l2 = l2.next;
             }
 
             carray = sum/10;
 
             current.next = new ListNode(sum%10);
             current = current.next;
             
         }
 
         return reverseList(dummy.next);
         
     }
 }