public class DeleteFromBeginningAndEnd {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void deleteFromBeginning() {
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    public void deleteFromEnd() {
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

    }

    public void add(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteFromBeginningAndEnd l = new DeleteFromBeginningAndEnd();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
l.printList();
l.deleteFromBeginning();
l.printList();
l.deleteFromBeginning();
l.printList();
    }
}
