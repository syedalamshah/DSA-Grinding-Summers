// Reverse a Linked List - DSA Tutorial
// Time: O(n), Space: O(1)

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
 }

 class LinkedList {
    Node head;
    
    // Method to reverse the linked list
    // Time: O(n) - visit each node once
    // Space: O(1) - only 3 extra pointers
    public Node reverse() {
        // Step 1: Initialize 3 pointers
        Node prev = null;    // Previous node (starts as null)
        Node curr = head;    // Current node (starts from head)
        Node next = null;    // Next node (to save reference)
        
        // Step 2: Traverse and reverse links
        while (curr != null) {
            // Save next node before breaking link
            next = curr.next;
            
            // Reverse the link (point backwards)
            curr.next = prev;
            
            // Move pointers forward
            prev = curr;     // Previous becomes current
            curr = next;     // Current becomes next
        }
        
        // Step 3: Update head to last processed node
        head = prev;
        return head;
    }
    
    // Helper: Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    // Helper: Display list
  public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) System.out.print(" → ");
            curr = curr.next;
        }
        System.out.println(" → null");
    }
}

  class ReverseLinkedList {
    public static void main(String[] args) {
        System.out.println("=== Reverse Linked List Demo ===\n");
        
     LinkedList list = new LinkedList();
        
        // Create list: 1 → 2 → 3 → null
        list.insertAtBeginning(3);
        list.insertAtBeginning(2); 
        list.insertAtBeginning(1);
        
        System.out.println("Original List:");
        list.display();
        
        System.out.println("\nReversing...");
        list.reverse();
        
        System.out.println("Reversed List:");
        list.display();
        
        // Manual dry run
        dryRun();
    }
    
   

    public static void dryRun() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("🧠 DRY RUN - Step by Step");
        System.out.println("=".repeat(50));
        
        System.out.println("\n📍 Initial: 1 → 2 → 3 → null");
        System.out.println("prev = null, curr = [1], next = null");
        
        System.out.println("\n📍 Iteration 1:");
        System.out.println("next = curr.next     → next = [2]");
        System.out.println("curr.next = prev     → [1].next = null");
        System.out.println("prev = curr          → prev = [1]");
        System.out.println("curr = next          → curr = [2]");
        System.out.println("Result: null ← [1]   [2] → [3] → null");
        
        System.out.println("\n📍 Iteration 2:");
        System.out.println("next = curr.next     → next = [3]");
        System.out.println("curr.next = prev     → [2].next = [1]");
        System.out.println("prev = curr          → prev = [2]");
        System.out.println("curr = next          → curr = [3]");
        System.out.println("Result: null ← [1] ← [2]   [3] → null");
        
        System.out.println("\n📍 Iteration 3:");
        System.out.println("next = curr.next     → next = null");
        System.out.println("curr.next = prev     → [3].next = [2]");
        System.out.println("prev = curr          → prev = [3]");
        System.out.println("curr = next          → curr = null");
        System.out.println("Result: null ← [1] ← [2] ← [3]");
        
        System.out.println("\n📍 Final: head = prev = [3]");
        System.out.println("✅ Final Result: 3 → 2 → 1 → null");
      }
 }
