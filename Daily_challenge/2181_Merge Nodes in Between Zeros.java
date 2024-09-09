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
    public ListNode mergeNodes(ListNode head) {

        ListNode temp = head;

        ListNode curNode = new ListNode();
        ListNode ansHead = curNode;
        int total = 0;
        int firstFlag = 1;

        while(temp != null){
            if(temp.val == 0 && total > 0){
                if(firstFlag == 1){
                    curNode.val = total;
                    curNode.next = null;
                    firstFlag = 0;
                }else{
                    ListNode t = new ListNode();
                    t.val = total;
                    t.next = null;
                    curNode.next = t;
                    curNode = t;
                }
                total = 0;
            }else{
                total = total + temp.val;
            }
            temp = temp.next;
        }

        return ansHead;
    }
}