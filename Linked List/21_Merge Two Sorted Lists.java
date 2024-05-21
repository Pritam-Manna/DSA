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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;
        ListNode head = null;
        ListNode prev = null;
        ListNode next = null;
        int curVal = 0;

        int counter = 0;

        while(!(pointer1 == null && pointer2 == null)){
            counter++;

            if(pointer1 != null && pointer2 != null){
                if(pointer1.val<pointer2.val){
                    curVal = pointer1.val;
                    pointer1 = pointer1.next;
                }else{
                    curVal = pointer2.val;
                    pointer2 = pointer2.next;
                }
            }else if(pointer1 != null){
                curVal = pointer1.val;
                pointer1 = pointer1.next;
            }else if(pointer2 != null){
                curVal = pointer2.val;
                pointer2 = pointer2.next;
            }

            ListNode newNode = new ListNode(curVal, null);

            if(counter == 1){
                head = newNode;
                prev = newNode;
                next = newNode;
            }else{
                prev = next;
                next = newNode;
                prev.next = next;
            }
        }

        return head;
    }
}