public class DepthFirstSearch {
    public DepthFirstSearch() {
    	
    	
    	
        System.out.println("Call DFS with root node to do a Depth First Search.");
    }

    /**
     * Perform Depth-First Search (DFS) in preorder manner.
          */
    public void DFS(Node node) {
        dfsHelper(node);
    }

    /**
     * Helper method for recursive DFS traversal.
     *
     * @param node The current node being processed.
     */
    private void dfsHelper(Node node) {
        if (node == null) {
        	
            return;
            
        }

        
        
        
        // Print the value of the current node
        System.out.println("Node Value: " + node.getData());

        // Recursively traverse the left child
        dfsHelper(node.getLeftChild());

        // Recursively traverse the right child
        dfsHelper(node.getRightChild());
    }
}
