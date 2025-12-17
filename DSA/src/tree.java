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
    public void print(){
        System.out.println(root.data);
        
    }
}

public class tree {
    public static void main(String[] args) {
        tre  t = new tre();
        t.root = new Node4(69);
        t.print();
    }
}
