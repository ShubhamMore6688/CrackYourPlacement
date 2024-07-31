class Solution {
    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverseLinkedList(ListNode head){

        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode front = null;

        ListNode temp = head;

        while(temp != null){

            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;

    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode reverseNode = reverseLinkedList(mid);
        ListNode newreversenode = reverseNode;


        while(head != null && reverseNode != null){
            if(head.val != reverseNode.val){
                break;
            }

            head = head.next;
            reverseNode = reverseNode.next;
        }

        reverseLinkedList(newreversenode);

        return head == null || reverseNode == null;

    }
}