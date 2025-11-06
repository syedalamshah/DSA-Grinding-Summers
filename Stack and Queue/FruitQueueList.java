class Node {
    String fruit;
    Node next;
    Node(String fruit) { this.fruit = fruit; this.next = null; }
}

public class FruitQueueList {
    Node front = null, rear = null;

    void enqueue(String fruit) {
        Node newNode = new Node(fruit);
        if (rear == null)
            front = rear = newNode;
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    void dequeue() {
        if (front == null)
            System.out.println("Queue empty");
        else {
            System.out.println("Removed: " + front.fruit);
            front = front.next;
            if (front == null) rear = null;
        }
    }

    void peek() {
        if (front == null) System.out.println("Queue empty");
        else System.out.println("Front: " + front.fruit);
    }

    public static void main(String[] args) {
        FruitQueueList q = new FruitQueueList();
        q.enqueue("Mango");
        q.enqueue("Orange");
        q.peek();       
        q.dequeue();    
        q.peek();       
    }
}
