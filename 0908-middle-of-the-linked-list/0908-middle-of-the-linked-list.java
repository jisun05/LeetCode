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
    public ListNode middleNode(ListNode head) {

            //5dlfruddn 3
            //6일경우 4
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;





        
    }
}