import java.util.*;
class Node1{
    int data;
    Node1 next;
    Node1(int value){
        this.data = value;
        this.next = null;
    }
}
class sta{
    Node1 top;
    public void push(int value){
        Node1 n = new Node1(value);
            n.next = top;
            top = n;
    }
    public void pop(){
            top = top.next ;
    }
    public void peek(){
        Node1 curr = top;
        if(curr==null){
            System.out.println( "No value" );
            return;
        }
            System.out.println(curr.data);
    }
    
    public void display(){
            if(top==null){
                return;
            }
            Node1 curr = top;
            while(curr!=null){
                System.out.print(curr.data + " ");
                curr = curr.next;

            }
    }

}

public class stack {
    public static void main(String[] args) {
        sta num = new sta();
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        for(int i = 0; i<nu ; i++){
            int a = sc.nextInt();
            num.push(a);
        }
        
        // num.display();
        // num.peek();
        // num.pop();
    }
}
