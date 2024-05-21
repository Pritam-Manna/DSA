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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pointer = head;

        ListNode prev2 = null;
        ListNode next = null;

        int counter = 0;
        int length = 0;
        int del_from_first = 0;

        while (pointer!=null){
            pointer = pointer.next;
            length ++;
        }

        del_from_first = length - n;
        pointer = head;

        if(del_from_first == 0){ //first elem
            pointer= pointer.next;
            return pointer;
        }else{
            for(int i=1; i<del_from_first; i++){
                pointer = pointer.next;
            }
            pointer.next = pointer.next.next;
            return head;
        }
        
    }
}