import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int value){
        this.data=value;
        this.next=null;
        this.prev=null;
    }
}
class DLL {
    Node head;

    // Insert at END (your insert logic)
    public void insert(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.prev = curr;
    }

    // Insert at FRONT (your insertF logic)
    public void insertF(int val) {
        Node n = new Node(val);

        if (head != null) {
            n.next = head;
            head.prev = n;
        }

        head = n;
    }

    // DELETE FIRST
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // DELETE LAST
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.prev.next = null;
    }

    // DELETE MIDDLE (by position)
    public void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (pos == 0) {
            deleteFirst();
            return;
        }

        Node curr = head;
        int i = 0;

        while (curr != null && i < pos) {
            curr = curr.next;
            i++;
        }

        if (curr == null) {
            System.out.println("Invalid position");
            return;
        }

        if (curr.next == null) {
            deleteLast();
            return;
        }

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
    }

    // DISPLAY
    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}


public class Doub {
    public static void main(String[] args) {
        

        DLL list = new DLL();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        int choice = -1;

        while (choice != 0) {

            choice = sc.nextInt();

            if (choice == 1) {
                list.deleteFirst();
            }
            else if (choice == 2) {
                System.out.print("Enter position (0-based): ");
                int pos = sc.nextInt();
                list.deleteAtPosition(pos);
            }
            else if (choice == 3) {
                list.deleteLast();
            }
            else if (choice == 4) {
                list.print();
            }
            else if (choice == 0) {
                System.out.println("Exiting...");
            }
            else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    } 
}

