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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode pointer = head;
        ListNode prev = null;
        ListNode next = null;
        ListNode tempHead = null;
        ListNode newHead = null;
        int counter =0;

        if(pointer == null || pointer.next == null){
            return pointer;
        }

        while(pointer!= null){
            counter++;
            if(left-1 == counter){
                tempHead = pointer;
            }
            if(counter>=left && counter <=right ){
                next = pointer.next;
                pointer.next = prev;
                prev = pointer;
                pointer = next;

            }else if(counter>right){
                break;
            }else{
                prev = pointer;
                pointer = pointer.next;
            }
        }

        if(tempHead == null){
            newHead = prev;
            head.next = pointer;
        }else{
            newHead = head;
            tempHead.next.next = next;
            tempHead.next = prev;
        }

        return newHead;


    }
}