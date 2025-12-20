// import java.util.*;

// class Node5 {
//     int data;
//     Node5 left, right;

//     Node5(int val) {
//         data = val;
//         left = right = null;
//     }
// }

// class tr1 {
//     Node5 root;

    
//     public Node5 create(Node5 root, int val) {
//         if (root == null) {
//             return new Node5(val);
//         }

//         if (val < root.data) {
//             root.left = create(root.left, val);
//         } else {
//             root.right = create(root.right, val);
//         }
//         return root;
//     }

//     public void insert(int value) {
//         root = create(root, value);
//     }

    
//     public void print() {
//         inorder(root);
//     }

//     public void inorder(Node5 root) {
//         if (root == null) return;

//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }
    
//     public boolean search(int val) {
//         return dsearch(root,val);
//     }

//     public boolean  dsearch(Node r, int val){
//         if(r==null){
//             return false;
//         }
//         if(r.data == val){
//             return true;
//         }
//         if(val<r.data){
//             return dsearch(r.left,val);
//         }
//         return desearch(r.right,val);
//     }

    
// }

// public class Btree {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         tr1 t = new tr1();

//         int n = sc.nextInt();   
//         for (int i = 0; i < n; i++) {
//             t.insert(sc.nextInt());
//         }

//         // t.print(); 
//         System.out.println(t.search(54)); 
//         sc.close();

//     }
// }









import java.util.*;

class Node5 {
    int data;
    Node5 left, right;

    Node5(int val) {
        data = val;
        left = right = null;
    }
}

class tr1 {
    Node5 root;

    public Node5 create(Node5 root, int val) {
        if (root == null) {
            return new Node5(val);
        }

        if (val < root.data) {
            root.left = create(root.left, val);
        } else {
            root.right = create(root.right, val);
        }
        return root;
    }

    public void insert(int value) {
        root = create(root, value);
    }

    public void print() {
        inorder(root);
    }

    public void inorder(Node5 root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public boolean search(int val) {
        return dsearch(root, val);
    }

    public boolean dsearch(Node5 r, int val) {
        if (r == null) return false;
        if (r.data == val) return true;

        if (val < r.data)
            return dsearch(r.left, val);
        else
            return dsearch(r.right, val);
    }
}

public class Btree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tr1 t = new tr1();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            t.insert(sc.nextInt());
        }

        System.out.println(t.search(54));
        sc.close();
    }
}
