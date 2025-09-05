public class InsertAtBeginningAndEnd {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head;

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;

    }

    public void beginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printList(){
        for(Node temp = head;temp!=null;temp = temp.next){
            System.out.print(temp.data+"-->");
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
InsertAtBeginningAndEnd l = new InsertAtBeginningAndEnd();
l.addAtEnd(10);
l.addAtEnd(20);
l.beginning(5);
l.printList();
    }

}
