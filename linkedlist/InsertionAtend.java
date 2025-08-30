// Insert at Beginning and End - Short Version

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
    
    // Insert at Beginning - O(1)
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;        // Connect to old head
        head = newNode;             // Update head
    }
    
    // Insert at End - O(n)
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {         // Empty list
            head = newNode;
            return;
        }
        
        Node curr = head;           // Find last node
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;        // Connect to end
    }
    
    // Display list
    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) System.out.print(" → ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class InsertionAtend {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Problem: Insert 10 → Insert 20 → Insert 5 at beginning
        list.insertAtEnd(10);           // 10
        list.insertAtEnd(20);           // 10 → 20
        list.insertAtBeginning(5);      // 5 → 10 → 20
        
        list.display();                 // Output: 5 → 10 → 20
    }
}

/*
Time Complexity:
- Insert at Beginning: O(1)
- Insert at End: O(n)
Space Complexity: O(1)
*/