// Find Middle of Linked List - Tortoise & Hare Method
// Time: O(n), Space: O(1)

class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

class LinkedList {
    Node head;
    
    // MAIN METHOD: Find Middle Node
    public Node findMiddle() {
        Node slow = head;    // 🐢 Tortoise - moves 1 step
        Node fast = head;    // 🐰 Hare - moves 2 steps
        
        // Move until fast reaches end
        while (fast != null && fast.next != null) {
            slow = slow.next;        // 🐢 Move 1 step
            fast = fast.next.next;   // 🐰 Move 2 steps
        }
        
        return slow;    // 🎯 Slow is at middle!
    }
    
    // Helper: Add node
    void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    // Helper: Display
    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " → ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

class FindMiddle {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Test Case 1: Odd length [1,2,3,4,5]
        list.add(5); list.add(4); list.add(3); list.add(2); list.add(1);
        System.out.println("List: "); list.display();
        Node middle = list.findMiddle();
        System.out.println("Middle: " + middle.data + "\n");
        
        // Show step-by-step breakdown
        breakdown();
    }
    
    static void breakdown() {
        System.out.println("🧠 HOW IT WORKS:");
        System.out.println("List: 1 → 2 → 3 → 4 → 5 → null\n");
        
        System.out.println("Step 1: slow=[1], fast=[1]");
        System.out.println("Step 2: slow=[2], fast=[3]");  
        System.out.println("Step 3: slow=[3], fast=[5]");
        System.out.println("Step 4: fast.next=null, STOP!");
        System.out.println("✅ Middle = slow = [3]");
        
        System.out.println("\n🔍 WHY IT WORKS:");
        System.out.println("• Fast moves 2x speed of slow");
        System.out.println("• When fast travels full distance");  
        System.out.println("• Slow travels half distance = middle!");
        
        System.out.println("\n📊 COMPLEXITY:");
        System.out.println("• Time: O(n) - single pass");
        System.out.println("• Space: O(1) - only 2 pointers");
    }
}

/*
🎯 QUICK BREAKDOWN:

1. Start both pointers at head
2. Move slow 1 step, fast 2 steps  
3. When fast can't move 2 steps → STOP
4. Slow pointer = Middle node

🏃‍♂️ EXAMPLE TRACE:
List: 1→2→3→4→5
      ↑     ↑
    slow  fast

After 1 iteration: 1→2→3→4→5
                     ↑   ↑
                   slow fast

After 2 iterations: 1→2→3→4→5  
                       ↑     ↑
                     slow   fast

fast.next = null → STOP
Middle = slow = 3 ✅
*/