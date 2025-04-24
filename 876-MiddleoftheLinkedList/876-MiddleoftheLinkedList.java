// Last updated: 4/24/2025, 8:36:36 AM
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
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

// important point to remeber is that:
/*
        while(fast.next != null && fast.next.next != null) means the first middle node in an even nodes
        
        while(fast != null && fast.next != null) means the second middle node in an even nodes

        1->2->3->4->5->6->
              |  |
              first
                  second
*/