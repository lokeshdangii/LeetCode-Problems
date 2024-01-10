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
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = get_Length(head);
        
        if(len == 1){
            head = null;
            return head;
        }

        if(len == n){
            head = head.next;
            return head;
        }
        
        ListNode tmp = head;
        for(int i=1;i<len-n;i++){
            tmp = tmp.next;
        }
        
        tmp.next = tmp.next.next;
        
        return head;
        
    }
}