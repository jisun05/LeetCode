/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        // fast가 끝에 도달할 때까지 반복
        while (fast != null && fast.next != null) {
            slow = slow.next;         // 한 칸 이동
            fast = fast.next.next;    // 두 칸 이동
        }
        
        // slow가 중간 노드를 가리킴
        return slow;
    }
}
