// Last updated: 4/25/2025, 8:01:05 PM
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

    public ListNode reveseLinkedList(ListNode secondHalf){
        ListNode current = secondHalf;
        ListNode forward = secondHalf;
        ListNode previous = null;

        while(current!=null){
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }
        return previous;
    }
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode secondPartOfLinkedList = slow.next;
        slow.next = null;

        ListNode reversedLinkedList = reveseLinkedList(secondPartOfLinkedList);

        while(head!=null && reversedLinkedList!=null){

            if(reversedLinkedList.val != head.val){
                return false;
            }

            head = head.next;
            reversedLinkedList =  reversedLinkedList.next;
        }
        return true;
    }
}