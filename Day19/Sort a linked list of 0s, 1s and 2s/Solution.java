class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        Node temp = head;
        
        int cnt[] = {0,0,0};
        
        while(temp != null){
            cnt[temp.data] += 1;
            temp = temp.next;
        }
        
        
        int idx = 0;
        temp = head;
        
        while(temp != null){
            if(cnt[idx]==0){
                idx += 1;
            }else{
                temp.data = idx;
                cnt[idx] -= 1;
                
                temp = temp.next;
            }
        }
        
        return head;
    }
}
