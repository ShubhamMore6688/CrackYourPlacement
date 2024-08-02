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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = reverseLinkedlist(l1);
        ListNode temp2 = reverseLinkedlist(l2);   

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int carry = 0;

        while(temp1 != null || temp2 != null || carry != 0){
            int sum = carry;

            if(temp1 != null){
                sum += temp1.val;
                temp1 = temp1.next;
            }

            if(temp2 != null){
                sum += temp2.val;
                temp2 = temp2.next;
            }

            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum/10;

        }


        return reverseLinkedlist(dummy.next);
    }
}