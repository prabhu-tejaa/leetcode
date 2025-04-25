// Last updated: 4/25/2025, 7:30:23 PM
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

    public int lenghtOfLinkedList(ListNode head){
        int length = 0;
        ListNode temp = head;

        while(temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null && head.next == null){
            return head;
        }

        if(lenghtOfLinkedList(head) < k){
            return head;
        }

        ListNode previous = null;
        ListNode current = head;
        ListNode forward = head;
        int count = 0;

        while(current!=null && count < k){
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
            count++;
        }

        if(forward != null){
            head.next = reverseKGroup(forward, k);
        }
        return previous;
    }
}