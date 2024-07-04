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
    public ListNode mergeNodes(ListNode head) {
        ListNode node = head;
        ListNode ans = null, ansI = null;
        
        while(node != null){
            ListNode start = node.next;
            int sum = 0;

            while(start!=null && start.val!=0){
                sum += start.val;
                start = start.next;
            }

            if(sum!=0){
                if(ans == null){
                    ans = new ListNode(sum);
                    ansI = ans;
                }else{
                    ansI.next = new ListNode(sum);
                    ansI = ansI.next;
                }
            }

            node = start;
        }
        return ans;        
    }
}