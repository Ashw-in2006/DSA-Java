import java.util.*;
class Node2{
    int data;
    Node2 top;
    Node2(int value){
        this.data=value;
        this.top = null;
    }
}
class que{
        Node2 top;
        public void insert(int value){
            Node2 n = new Node2(value);
            if(top==null){
                
            }
        }
}
public class queue {
    public static void main(String[] args) {
        que n = new que();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i< num ; i++){
            int a = sc.nextInt();
            n.insert(a);
        }
    }
}
