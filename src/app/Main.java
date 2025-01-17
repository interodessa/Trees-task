package app;

public class Main {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right.left = new Node(12);

        System.out.print("Preorder traversal: ");
        tree.traversePreOrder(tree.root);
        System.out.print("\nInorder traversal: ");
        tree.traverseInOrder(tree.root);
        System.out.print("\nPostorder traversal: ");
        tree.traversePostOrder(tree.root);
    }
}
