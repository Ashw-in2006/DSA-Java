import java.util.*;
class Node4{
int data;
Node4 right;
Node4 left;
Node4(int val){
    this.data = val;
    this.right = null;
    this.left = null;
} 
}
class tre{
    Node4 root;
     int min = Integer.MAX_VALUE;
    public void ino(Node4 value){
        if(value==null){
            return;
        }
        if(value.data<min){
            min = value.data;
        }
        ino(value.left);
        System.out.println(value.data+" ");
        ino(value.right);

    }
    public void post(Node4 value){
        if(value==null){
            return;
        }
        post(value.left);
        post(value.right);
        System.out.print("Post :");
        System.out.print(value.data);

    }
    int max = 0;
    public void pre(Node4 value){
        if(value==null){
            return;
        }
        if(value.data>max){
            max = value.data;
            
        }
        System.out.println(value.data+" ");
        
        pre(value.left);
        pre(value.right);
        
    }
    
    public int preor(Node4 value){

        if(value==null) {
            return 0;
        }
        return 1 + preor(value.left)+preor(value.right);
    }

    public void leaf(Node4 value){
        if(value==null){
            return;
        }
        if(value.left==null&&value.right==null){
            System.out.println(value.data+" ");
        }
        leaf(value.left);
        leaf(value.right);
        

    }
    int sum = 0;
      public void sum(Node4 value) {
        if (value == null) {
            return; 
        }

        sum += value.data; 
        sum(value.left);   
        sum(value.right);  
    }
    public void complete(Node4 value){
        if(value.left!=null&&value.right!=null){
            System.out.println("complete");
            // return;
        }
        else{
            System.out.println("Not complete");
        }

    }
    public void spiral(Node4 value){
        if(value.left==value.right && value.left != value.right){
            System.out.print("Not spiral");
        }
        else{
            System.out.println("spiral");
        }
    }
    

}


public class tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tre  t = new tre();
        t.root = new Node4(10);
        t.root.left = new Node4(20);
        t.root.right = new Node4(30);
        t.root.left.left = new Node4(40);
        t.root.left.right = new Node4(50);
        t.root.right.left = new Node4(60);
        t.root.right.right = new Node4(70);
        
        // t.pre(t.root);
        t.pre(t.root);
        //  System.out.print(t.sum);
        // t.post(t.root);
    }
}
