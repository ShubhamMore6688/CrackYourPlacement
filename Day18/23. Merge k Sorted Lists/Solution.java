class Solution {
    public ListNode mergeLinkedList(ListNode list1, ListNode list2){

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }

        if(list1 != null){
            temp.next = list1;
        }

        if(list2 != null){
            temp.next = list2;
        }


        return dummy.next;



    }
    public ListNode mergeKLists(ListNode[] lists) {

        int length = lists.length;
        if(lists == null || lists.length == 0) return null;

        if(length == 1){
            return lists[0];
        }
        

        
        ListNode sorted = mergeLinkedList(lists[0], lists[1]);

        for(int i=2; i<length; i++){
            sorted = mergeLinkedList(sorted, lists[i]);
        }


        return sorted;
    }
}