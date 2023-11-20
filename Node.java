/**
 * Each node contains an integer value, a left child, and a right child.
 */
public class Node {

    /** The integer value stored in the node. */
    private int data;

    /** The left child of the node. */
    private Node leftChild;

    /** The right child of the node. */
    private Node rightChild;

    /**
     * Constructs a new node with the given integer value.
     *
     * @param data The integer value to be stored in the node.
     */
    public Node(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    /**
     * Returns the integer value stored in the node.
     *
     * @return The integer value of the node.
     */
    public int getData() {
        return data;
    }

    /**
     * Returns the left child of the node.
     *
     * @return The left child of the node.
     */
    public Node getLeftChild() {
        return leftChild;
    }

    /**
     * Sets the left child of the node.
     *
     * @param leftChild The node to be set as the left child.
     */
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    /**
     * Returns the right child of the node.
     *
     * @return The right child of the node.
     */
    public Node getRightChild() {
        return rightChild;
    }

    /**
     * Sets the right child of the node.
     *
     * @param rightChild The node to be set as the right child.
     */
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
