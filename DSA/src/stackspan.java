import java.util.*;
class Node3{
    int data;
    Node3 next;
    Node3(int value){
        this.data=value;
        this.next=null;
    }
}
class stock{
    Node3 top;
    public void push(int value){
        Node3 n = new Node3(value);
        n.next = top;
        top = n;
    }
    public void check(){
        Node3 curr = top;

    }
    public void pop(){
        Node3 curr = top;
        Node3 temp = top;

    }
    public void peek(){
        Node3 curr = top;
        if(curr==null){
            System.out.println("No value");
            return;
        }
        System.out.println(curr.data);
    }
    public void display(){
        if(top==null){
            return;
        }
        Node3 curr = top;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

}
public class stackspan {
    public static void main(String[] args) {
        stock n = new stock();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i<num ; i++){
            int a = sc.nextInt();
            n.push(a);
            n.check();
        }
        n.display();
        n.peek();
        n.pop();
    }
}