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
    public ListNode swapPairs(ListNode head) {
        ListNode pointer = head;
        ListNode nextNode = null;
        int nextVal;

        while (pointer != null){
            if(pointer.next != null){
                nextNode = pointer.next;
                nextVal = nextNode.val;
                nextNode.val = pointer.val;
                pointer.val = nextVal;
                pointer = nextNode.next;
            }else{
                pointer = pointer.next;
            }
        }

        return head;
    }
}