class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode first = dummy, second = dummy;
        
        for (int i = 0; i < n; i++) {
            second = second.next;
        }
        
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        
        first.next = first.next.next;
        return dummy.next;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        
        // Test: 1->2->3->4->5, remove 2nd from end
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        ListNode result = s.removeNthFromEnd(head, 2);
        
        // Print: 1->2->3->5
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}