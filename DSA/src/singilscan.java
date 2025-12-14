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

    public void insertmid(int index,int value){
        Node n = new Node(value);
        if(index == 0){
            inF(value);
            return;
        }
        Node curr = head;
        int i = 0;
        while(i<index){
            curr = curr.next;
            i++;
        }
        n.next=curr.next;
        curr.next=n;


    }

    public void print(){
            Node cur= head;
            if(cur==null){
                System.out.println("no value");
                return;
            }
            while(cur!=null){
                System.out.print(cur.data);
                cur=cur.next;
            }
}
}

    // public void delf(){
    //     head = head.next;
    // }
    // public void delL(){
    //     Node a=head;
    //     while(a.next.next!=null){
    //         a=a.next.next;
    //     }
    //     a.next=null;
    // }


public class singilscan {
    public static void main(String[] args) {
            singly s = new singly();
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            for(int i = 0; i<num; i++){
                int b = sc.nextInt();
                s.insert(b);
            }
            s.inF(100);
            // s.print(); 
            // s.delf(40);
            s.insertmid(3,3000);
    }
}
