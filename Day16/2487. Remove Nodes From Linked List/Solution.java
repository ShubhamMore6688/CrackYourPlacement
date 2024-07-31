class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;

        Stack<ListNode> stack = new Stack<>();

        while(temp != null){
            while(!stack.isEmpty() && stack.peek().val < temp.val){
                stack.pop();
            }

            stack.push(temp);
            temp = temp.next;
        }

        ListNode nxt = null;

        while(!stack.isEmpty()){
            temp = stack.pop();
            temp.next = nxt;
            nxt = temp;
        }

        return nxt;


    }
}