class Node {
    int data;
    Node next;

    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

public class stest {
    public static void main(String[] args) {
        singly s = new singly();
        int val = 10;
        s.insert(val);
    }
}