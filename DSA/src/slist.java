import java.util.*;
class Node{
    int data;
    Node next;

    Node(int value){
        this.data=value;
        this.next=null;
    }
}

class singly{
    Node head;
    public void insert(int val){
        Node n = new Node(val);
        if(head==null){

            head= n;
            System.out.println(head.data);
            return;
        }

        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next=n;
        System.out.println(curr.next.data);
    }
    public void inF(int list){
        Node n= new Node(list);
        n.next=head;
        head=n;
    }

    public void print(){
            Node cur= head;
            while(cur!=null){
                System.out.println(cur.data);
                cur=cur.next;
            }
}
}



public class slist {
    public static void main(String[] args) {
            singly s = new singly();
            int val = 10;
            s.insert(val);
            s.insert(100);
            s.insert(160);
            s.insert(890);
            s.inF(100);
            s.print();
    }
}
