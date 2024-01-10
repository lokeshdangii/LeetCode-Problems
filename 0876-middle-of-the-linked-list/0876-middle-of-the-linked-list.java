/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

//     function to get size of LL
    public int get_Length(ListNode head){
        
        if(head == null){
            return 0;
        }

        int count = 0;
        ListNode tmp = head;
        while(tmp != null){
            count++;
            tmp = tmp.next;
        }
        return count;
    }
    
    public ListNode middleNode(ListNode head) {
        int len = get_Length(head);
        int mid = (int) (len/2);
        int mid_val;
        
        if(len == 1){
            return head;
        }
        
        ListNode tmp = head;
        for(int i=1;i<mid;i++){
            tmp = tmp.next;
        }
        
        
        return tmp.next;
    }
}