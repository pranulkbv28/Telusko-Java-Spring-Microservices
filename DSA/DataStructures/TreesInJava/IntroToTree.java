package DSA.DataStructures.TreesInJava;

class Node {
    int data;
    Node right;
    Node left;

    public Node(int data) {
        this.data = data;
    }
}

class BinaryTree {
    Node root;

    public void insert(int data) {
        root = inserRec(root, data);
    }

    private Node inserRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = inserRec(root.left, data);
        } else if (data > root.data) {
            root.right = inserRec(root.right, data);
        }

        return root;
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    public void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
}

public class IntroToTree {
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();

        bst.insert(8);
        bst.insert(7);
        bst.insert(12);
        bst.insert(15);
        bst.insert(2);
        bst.insert(5);

        bst.inOrder();
        System.out.println();
        bst.preOrder();
    }
}
