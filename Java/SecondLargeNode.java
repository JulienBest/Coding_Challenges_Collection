public class SecondLargeNode {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(10);
        System.out.println(tree.toString());
        //tree.getSmallest(tree.root);
    }
}

class Tree {
    public Node root;
    int smallestNumber;

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int x) {
        if (isEmpty()) {
            root = new Node(x);
        } else {
            if (x < root.value) {
                root.left.insert(x);
            } else {
                root.right.insert(x);
            }
        }
    }


    public String toString() {
        if (isEmpty()) {
            return "";
        } else {
            String s = ":" + root.value + ";";
            return s+ root.right.toString() + root.left.toString() + "";
        }
    }

}

class Node {
    int value;
    public Tree left, right;

    public Node(int val) {
        this.value = val;
        this.left = new Tree();
        this.right = new Tree();
    }
}
