class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {

    public static int getDecimalValue(ListNode head) {
        int num = 0;
        ListNode current = head;
        while (current != null) {
            num = (num << 1) | current.val;
            // Debug: Show the intermediate binary/decimal value
            System.out.println("After processing " + current.val + ": num = " + num);
            current = current.next;
        }
        return num;
    }

    // Helper method to build a linked list from array
    public static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // Sample test: 1 -> 0 -> 1
        int[] binaryNumber = {1, 0, 1};
        ListNode head = buildList(binaryNumber);

        int decimalValue = getDecimalValue(head);
        System.out.println("Decimal value: " + decimalValue);
    }
}
