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

    public ListNode removeElements(ListNode head, int val){

        // dummy node point as the first node so that first node can be removed as well
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = dummy;
        while(curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next; 
            }else{
                curr = curr.next;
            }
        }

        return dummy.next;

    }
   
}



// ---------------------------------------------------------
 // //     function to get size of LL
    // public int get_Length(ListNode head){
        
    //     if(head == null){
    //         return 0;
    //     }

    //     int count = 0;
    //     ListNode tmp = head;
    //     while(tmp != null){
    //         count++;
    //         tmp = tmp.next;
    //     }
    //     return count;
    // }

    // public ListNode removeElements(ListNode head, int val) {
       
    //     int len = get_Length(head);
    //     if(len == 0){
    //         return null;
    //     }
        
    //     if(len == 1){
    //         if(head.val == val){
    //             return null;
    //         }
            
    //         return head;
    //     }
        
    //     if(len == 2){
            
    //         if(head.val == val){
    //             head = head.next;
    //         }else if(head.next.val == val){
    //             head.next = null;
    //         }
            
    //         return head;
    //     }

    //     if(head.val == val){
    //         if(head.next == null){
    //             return head = null;
    //         }

    //         head = head.next;

    //         return removeElements(head,val);
    //     }

    //     ListNode prev = head;
    //     ListNode curr = head;
    //     // Looping on the LL        
    //     for(int i=0;i<len;i++){
    //         if(curr.val == val){
    //             prev.next = curr.next;
    //         }
    //         prev = curr;
    //         curr = curr.next;
    //     }
        

    //     return head;
    // }


// // -------------------------------------------------------------------------------------



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


 /*


        if(head == null){
            return head;
        }

        if(head.val == val){
            head = head.next;
            removeElements(head, val);
        }
        
        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            }
            
            
            prev = curr;
            curr = curr.next;
        }
 */