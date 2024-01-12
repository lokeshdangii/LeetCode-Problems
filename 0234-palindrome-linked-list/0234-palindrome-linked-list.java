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
    // function to get mid of the LL --> Slow-Fast Approach
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }

    public boolean isPalindrome(ListNode head) {
        // Step1 --> findMid
        ListNode midNode = findMid(head);

        // Step2 --> reverse LL from midNode
        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode right = prev;
        ListNode left = head;

        // Step3 --> cheking left and right part
        while(right!=null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
}



// The simple approach --> Copying in array Space Complexity--> O(n)
/* 
     public boolean isPalindrome(ListNode head) {
        int size = 0;
        ListNode tmp = head;

        // to calculate the length of LL
        while(tmp != null){
            tmp = tmp.next;
            size++;
        }

        // will store the ll data in array
        int arr[] = new int[size];
        ListNode node = head;
        for(int i=0;i<size;i++){
            arr[i] = node.val;
            node = node.next;
        }

        // traversing array
        int i=0;
        int j= size-1;

        while(i<=j){
            if(arr[i] != arr[j]){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
*/