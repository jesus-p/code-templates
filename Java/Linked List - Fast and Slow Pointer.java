public int fn(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    int ans = 0;

    while (fast != null && fast.next != null) {
        // do logic
        slow = slow.next;
        fast = fast.next.next;
    }

    return ans;
}
/*
 * Useful to use the fast and slow pointer technique to find the middle of a
 * linked list. Slow pointer moves one step at a time, while fast pointer moves
 * two steps at a time. When fast pointer reaches the end, slow pointer will be
 * at the middle.
 */