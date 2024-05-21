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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pointer = head;
        ListNode temp = null;
        ListNode del = null;

        if(pointer == null || pointer.next == null){
            return head;
        }else{
            while(pointer!= null){
                if(pointer.next != null && pointer.val == pointer.next.val){
                    temp = pointer.next.next;
                    del = pointer.next;
                    pointer.next = temp;
                    del.next = null;
                }else{
                    pointer= pointer.next;
                }
            }
            return head; 
        }


    }
}