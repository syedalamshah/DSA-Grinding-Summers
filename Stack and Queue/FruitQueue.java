class FruitQueueArray {
    String[] fruits = new String[5];
    int front = 0, rear = -1, size = 0;

    void enqueue(String fruit) {
        if (size == fruits.length) System.out.println("Queue full");
        else {
            rear = (rear + 1) % fruits.length;
            fruits[rear] = fruit;
            size++;
        }
    }

    void dequeue() {
        if (size == 0) System.out.println("Queue empty");
        else {
            System.out.println("Removed: " + fruits[front]);
            front = (front + 1) % fruits.length;
            size--;
            if (size == 0) { // reset indices when queue becomes empty
                front = 0;
                rear = -1;
            }
        }
    }

    void peek() {
        if (size == 0) System.out.println("Queue empty");
        else System.out.println("Front: " + fruits[front]);
    }
}

public class FruitQueue {
    public static void main(String[] args) {
        FruitQueueArray q = new FruitQueueArray();
        q.enqueue("Apple");
        q.enqueue("Banana");
        q.peek();       // Front: Apple
        q.dequeue();    // Removed: Apple
        q.peek();       // Front: Banana
    }
}
