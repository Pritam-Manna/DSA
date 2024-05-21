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
        ListNode oldPointer = head;
        ListNode prev = head;
        ListNode newHead = null;
        int headUpdt = 0;
        int prev_dup = 0;

        while(pointer != null){
            if(pointer.next != null){
                if(pointer.val == pointer.next.val){
                    // equal
                    if(newHead != null){
                        oldPointer = pointer;
                        prev.next = pointer.next;
                        pointer = prev.next;
                        oldPointer.next = null;
                        
                    }else{
                        oldPointer = pointer;
                        prev = pointer.next;
                        pointer = prev;
                        oldPointer.next = null;
                    }
                    
                    prev_dup = 1;
                }else if(prev_dup == 1){
                    if(newHead != null){
                        oldPointer = pointer;
                        prev.next = pointer.next;
                        pointer = prev.next;
                        oldPointer.next = null;
                        
                    }else{
                        oldPointer = pointer;
                        prev = pointer.next;
                        pointer = prev;
                        oldPointer.next = null;
                    }
                    prev_dup = 0;
                }else{
                    prev = pointer;
                    pointer = pointer.next;
                }
            }else if(prev_dup == 1){
                if(newHead != null){
                    oldPointer = pointer;
                    prev.next = pointer.next;
                    pointer = prev.next;
                    oldPointer.next = null;
                    
                }else{
                    oldPointer = pointer;
                    prev = pointer.next;
                    pointer = prev;
                    oldPointer.next = null;
                }
                prev_dup = 0;
            }else{
                prev = pointer;
                pointer = pointer.next;
            }

            if(headUpdt == 0 && prev_dup == 0){
                if(prev == null || prev.next == null || prev.val != prev.next.val){
                    headUpdt = 1;
                    newHead = prev;
                }
            }
        }
        return newHead;
    }
}