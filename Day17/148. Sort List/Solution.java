class Solution {
    public ListNode sortList(ListNode head) {
        
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();

        while(temp !=null){
            list.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(list);

        ListNode dummy = new ListNode(0);

        ListNode curr = dummy;

        for(int i=0; i<list.size(); i++){
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }

        return dummy.next;
    }
}