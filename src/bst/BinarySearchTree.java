package bst;

public class BinarySearchTree {
    public Node insert(Node node, int value) {
        if(node == null) {
            return createNewNode(value);
        }

        if(value < node.value) {
            node.left = insert(node.left,value);
        } else if(value > node.value) {
            node.right = insert(node.right,value);
        }

        return node;
    }

    public Node createNewNode(int value) {
        Node node = new Node();
        node.value = value;
        node.left = null;
        node.right = null;
        return node;
    }
}
