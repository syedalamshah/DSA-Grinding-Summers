class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class PalindromeOptimal {
    
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        
        // Step 1: Find middle
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Step 2: Reverse second half
        ListNode secondHalf = reverse(slow.next);
        
        // Step 3: Compare first and second half
        ListNode firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    
    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    
    public static void main(String[] args) {
        // Test: 1->2->2->1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        
        System.out.println(isPalindrome(head)); // true
    }
}