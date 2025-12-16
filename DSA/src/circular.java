import java.util.*;
class Node{
    int data;
    Node next;
   
    Node(int val){
        this.data = val;
        this.next = null;
        
    }

}
class Doubly{
    Node head;
    public void insert(int val){
        Node n = new Node(val);
        if(head==null){

            head= n;
            n.next = head;
            // System.out.println(head.data);
            return;
        }

        Node curr = head;
        while(curr.next!=head){
            curr = curr.next;
        }
        curr.next=n;
        // System.out.println(curr.next.data);
        n.next=head;
    }


    public void insertAtBeginning(int val) {
        Node n = new Node(val);
        Node curr = head;
        while(curr.next!=head){
            curr = curr.next;
        }

        n.next = head;
        head = n;
        curr.next = n;
        
        System.out.println(head.data);
    }



    public void insertAtPosition(int index, int value) {
        if (index < 0) {
            System.out.println("Invalid position!");
            return;
        }
        
        if (index == 0) {
            insertAtBeginning(value);
            return;
        }

        Node n = new Node(value);
        Node curr = head;
        int i = 1;
        
        // Traverse to the node before the insertion point
        while (curr.next != head && i < index - 1) {
            curr = curr.next;
            i++;
        }
        
        // if (curr == head) {
        //     System.out.println("Position out of bounds!");
        //     return;
        // }
        
        n.next = curr.next;
        curr.next = n;
        System.out.println("Inserted at position " + index + ": " + value);
    }

    public void print() {
        Node curr = head;

        if (curr == null) {
            // System.out.println("List is empty!");
            return;
        }
        
        System.out.print("Circular Linked List: ");
        
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;

        }while(curr!=head);

    }

}
public class circular {
    public static void main(String[] args) {
        Doubly s = new Doubly();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Singly Linked List Operations ===");
        
        // Creating initial list
        System.out.print("Enter number of nodes to create: ");
        int num = sc.nextInt();
        System.out.println("Enter " + num + " values:");
        for (int i = 0; i < num; i++) {
            int b = sc.nextInt();
            s.insert(b);
        }
        // s.insertAtBeginning(89);
        s.insertAtPosition(1, 7);
        s.print();
    }
}
