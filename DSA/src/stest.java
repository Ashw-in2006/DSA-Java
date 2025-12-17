import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int value){
        this.data=value;
        this.next=null;
    }
}
class sing{
    Node head;
    public void insert(int value){
        Node n = new Node(value);
        if(head==null){
            head = n;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
            curr.next=n;
    }
    public void display(){
        if(head==null){
            System.out.println("nothing !!!");
            return;
        }
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
public abstract class stest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            sing s = new sing();
            

                s.insert(7);
                s.insert(8);
                s.insert(9);
                s.insert(10);
                s.display();
            
    }
}

