
class Solution {
    public int getDecimalValue(ListNode head) {
        
        ListNode temp = head;
        int n = 0;

        while(temp != null){
            n++;
            temp = temp.next;
        }

        int no = 0;
        temp = head;
        for(int i=0; i<n; i++){

            int power = (int)Math.pow(2, n-i-1);
            no += temp.val*power;

            temp = temp.next;
        }

        return no;
        
    }
}