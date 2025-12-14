import java.util.*;

class Node {
    int data;
    Node next;

    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // 1. Creation/Insertion at end
    public void insert(int val) {
        Node n = new Node(val);
        if (head == null) {
            head = n;
            System.out.println("Inserted at head: " + head.data);
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = n;
        System.out.println("Inserted at end: " + curr.next.data);
    }

    // 2. Insertion at beginning
    public void insertAtBeginning(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
        System.out.println("Inserted at beginning: " + head.data);
    }

    // 3. Insertion at middle (specific position)
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
        int i = 0;
        
        // Traverse to the node before the insertion point
        while (curr != null && i < index - 1) {
            curr = curr.next;
            i++;
        }
        
        if (curr == null) {
            System.out.println("Position out of bounds!");
            return;
        }
        
        n.next = curr.next;
        curr.next = n;
        System.out.println("Inserted at position " + index + ": " + value);
    }

    // 4. Insertion after a specific value
    public void insertAfterValue(int targetValue, int newValue) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == targetValue) {
                Node n = new Node(newValue);
                n.next = curr.next;
                curr.next = n;
                System.out.println("Inserted " + newValue + " after " + targetValue);
                return;
            }
            curr = curr.next;
        }
        System.out.println("Value " + targetValue + " not found!");
    }

    // 5. Deletion from beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("Deleted from beginning: " + head.data);
        head = head.next;
    }

    // 6. Deletion from end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        
        if (head.next == null) {
            System.out.println("Deleted from end: " + head.data);
            head = null;
            return;
        }
        
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        System.out.println("Deleted from end: " + curr.next.data);
        curr.next = null;
    }

    // 7. Deletion from specific position
    public void deleteFromPosition(int index) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        
        if (index == 0) {
            deleteFromBeginning();
            return;
        }
        
        Node curr = head;
        int i = 0;
        
        // Traverse to the node before the one to delete
        while (curr != null && i < index - 1) {
            curr = curr.next;
            i++;
        }
        
        if (curr == null || curr.next == null) {
            System.out.println("Position out of bounds!");
            return;
        }
        
        System.out.println("Deleted from position " + index + ": " + curr.next.data);
        curr.next = curr.next.next;
    }

    // 8. Deletion by value
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        
        // If head needs to be deleted
        if (head.data == value) {
            System.out.println("Deleted by value: " + value);
            head = head.next;
            return;
        }
        
        Node curr = head;
        while (curr.next != null) {
            if (curr.next.data == value) {
                System.out.println("Deleted by value: " + value);
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
        System.out.println("Value " + value + " not found!");
    }

    // 9. Search for a value
    public boolean search(int value) {
        Node curr = head;
        int position = 0;
        while (curr != null) {
            if (curr.data == value) {
                System.out.println("Value " + value + " found at position " + position);
                return true;
            }
            curr = curr.next;
            position++;
        }
        System.out.println("Value " + value + " not found!");
        return false;
    }

    // 10. Get size of list
    public int getSize() {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    // 11. Display the list
    public void print() {
        Node curr = head;
        if (curr == null) {
            System.out.println("List is empty!");
            return;
        }
        
        System.out.print("Linked List: ");
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    // 12. Reverse the list
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        System.out.println("List reversed!");
    }
}

public class SinglyLinkedListOperations {
    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList();
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
        
        // Display initial list
        s.print();
        System.out.println("Size: " + s.getSize());
        
        // Menu-driven operations
        int choice;
        do {
            System.out.println("\n=== Choose Operation ===");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Insert after value");
            System.out.println("5. Delete from beginning");
            System.out.println("6. Delete from end");
            System.out.println("7. Delete from position");
            System.out.println("8. Delete by value");
            System.out.println("9. Search value");
            System.out.println("10. Reverse list");
            System.out.println("11. Display list");
            System.out.println("12. Get size");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at beginning: ");
                    s.insertAtBeginning(sc.nextInt());
                    break;
                    
                case 2:
                    System.out.print("Enter value to insert at end: ");
                    s.insert(sc.nextInt());
                    break;
                    
                case 3:
                    System.out.print("Enter position (0-based): ");
                    int pos = sc.nextInt();
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    s.insertAtPosition(pos, val);
                    break;
                    
                case 4:
                    System.out.print("Enter value to search: ");
                    int target = sc.nextInt();
                    System.out.print("Enter new value to insert after " + target + ": ");
                    int newVal = sc.nextInt();
                    s.insertAfterValue(target, newVal);
                    break;
                    
                case 5:
                    s.deleteFromBeginning();
                    break;
                    
                case 6:
                    s.deleteFromEnd();
                    break;
                    
                case 7:
                    System.out.print("Enter position to delete (0-based): ");
                    s.deleteFromPosition(sc.nextInt());
                    break;
                    
                case 8:
                    System.out.print("Enter value to delete: ");
                    s.deleteByValue(sc.nextInt());
                    break;
                    
                case 9:
                    System.out.print("Enter value to search: ");
                    s.search(sc.nextInt());
                    break;
                    
                case 10:
                    s.reverse();
                    break;
                    
                case 11:
                    s.print();
                    break;
                    
                case 12:
                    System.out.println("Size: " + s.getSize());
                    break;
                    
                case 0:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
            }
            
            if (choice != 0 && choice != 11 && choice != 12) {
                s.print();
            }
            
        } while (choice != 0);
        
        sc.close();
    }
}