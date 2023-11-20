public class Application {
    public static void main(String[] args) {
    	
    	
    	
        // Create a sample tree
    	
    	
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        
        
        root.setLeftChild(node2);
        root.setRightChild(node3);
        node2.setLeftChild(node4);
        node2.setRightChild(node5);

        Tree tree = new Tree(root);

        // Perform DFS
        DepthFirstSearch dfs = new DepthFirstSearch();
        dfs.DFS(tree.getRoot());
    }
}
