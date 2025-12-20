import java.util.Scanner;

class Node7 {
    int data;
    Node7 left, right;

    Node7(int value) {
        data = value;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    public Node7 insert(Node7 root, int value) {
        if (root == null) {
            return new Node7(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void inorder(Node7 root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}

public class BSTDynamicInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("Enter integers to insert into BST (enter -1 to stop):");

        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter integers only.");
                sc.next();
                continue;
            }

            int value = sc.nextInt();
            if (value == -1) {
                break;
            }
            bst.root = bst.insert(bst.root, value);
        }

        System.out.println("Inorder traversal of BST (sorted):");
        bst.inorder(bst.root);
        sc.close();
    }
}
