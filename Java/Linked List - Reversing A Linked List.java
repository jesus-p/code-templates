public ListNode fn(ListNode head){
    ListNode current = head;
    ListNode previous = null;
    while (current !=null){
        ListNode nextNode = curr.next;
        current.next = previous;
        previous = current;
        current = nextNode;
    }

    return previous;
}
/* An example where this is needed is to check if a linked list is a palindrome. You often reverse the second half of the list and compare it to the first half */
