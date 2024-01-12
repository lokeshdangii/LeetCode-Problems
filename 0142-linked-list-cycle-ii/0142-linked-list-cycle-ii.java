/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Step1 --> Detect Cycle
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return null;
        }
        // Step2 --> find meeting point
        int pos = 0;
        slow = head;
        ListNode prev = null;

        while(slow!=fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
            pos++;
        }

        // Step3 --> remove cycle --> last.next = null
        // prev.next = null; // prev is the last node of LL
        
        return slow;
    }
}