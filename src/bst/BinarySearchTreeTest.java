package bst;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        System.out.println("hi Binary SearcH Tree");

        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;
        root = bst.insert(root,6);
        root = bst.insert(root,7);
        root = bst.insert(root,1);
        root = bst.insert(root,3);
        root = bst.insert(root,2);
        root = bst.insert(root,5);

        System.out.println(root.toString());
    }
}
