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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode pointer = head;
        ListNode newHead = null;
        ListNode prev_tail = null;

        int length = 0;
        int actual_rotate = 0;

        while(pointer!= null){
            prev_tail = pointer;
            pointer = pointer.next;
            length++;
        }

        if(length != 0){
            actual_rotate = length - (k % length);

            pointer = head;

            if(actual_rotate == 0){
                return head;
            }else{
                for (int i=1; i< actual_rotate; i++) {
                    pointer = pointer.next;
                }
                prev_tail.next = head;
                newHead = pointer.next;
                pointer.next = null;

                return newHead;
            }
        }else{
            return head;
        }
        
        

    }
}