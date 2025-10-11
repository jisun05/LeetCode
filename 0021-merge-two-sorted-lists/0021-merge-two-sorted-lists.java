class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;     // 여기서 list1 이동
            } else {
                current.next = list2;
                list2 = list2.next;     // 여기서 list2 이동
            }
            current = current.next;      // 병합 리스트 포인터 이동
        }
     if(list1 != null){
            current.next = list1;
        }else{
            current.next = list2;
        }
        return dummy.next;
    }
}
