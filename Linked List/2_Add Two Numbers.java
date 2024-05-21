class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1_pointer = l1;
        ListNode l2_pointer = l2;

        ListNode res_head = null;
        ListNode res_prev = null;
        ListNode res_next = null;

        int counter = 0;
        int tempDigit = 0;
        int final_digit = 0;
        int extra = 0;

        while(!(l1_pointer == null && l2_pointer == null)){

	        counter ++;

	        if(l1_pointer != null && l2_pointer != null){
	        	tempDigit = l1_pointer.val + l2_pointer.val;
	        }else if(l1_pointer != null){
	        	tempDigit = l1_pointer.val;	        	
	        }else if(l2_pointer != null){
	        	tempDigit = l2_pointer.val;	        	
	        }
	        tempDigit = tempDigit + extra;
        	final_digit = tempDigit % 10;
        	extra = tempDigit / 10;
        	ListNode newNode = new ListNode(final_digit, null);

	        if(counter == 1){
	        	res_head = newNode;
	        	res_prev = newNode;
	        	res_next = newNode;
	        }else{
	        	res_prev = res_next;
	        	res_next = newNode;
	        	res_prev.next = res_next;
	        }

	        if(l1_pointer != null){
	        	l1_pointer = l1_pointer.next;
	        }
	        if(l2_pointer != null){
	        	l2_pointer = l2_pointer.next;
	        }
        }

        if(extra > 0){
        	ListNode newNode = new ListNode(extra, null);
        	res_prev = res_next;
	        res_next = newNode;
	        res_prev.next = res_next;
        }

        return res_head;
    }
}