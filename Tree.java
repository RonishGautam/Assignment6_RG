/**
 * Represents a binary tree with a root node.
 */
public class Tree {

    /** The root node of the tree. */
    private Node root;

    /**
     * Constructs a tree with the specified root node.
     *
     * @param root The root node of the tree.
     */
    public Tree(Node root) {
        this.root = root;
    }

    /**
     * Gets the root node of the tree.
     *
     * @return The root node of the tree.
     */
    public Node getRoot() {
        return root;
    }
}
