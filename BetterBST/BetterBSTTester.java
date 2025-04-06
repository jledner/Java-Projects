import java.util.LinkedList;

public class BetterBSTTester {
    public static void main(String[] args) {
        // Create an instance of BetterBST.
        BetterBST<Integer> bst = new BetterBST<>();
        
        // Insert nodes into the BST.
        // (Assumes that BinarySearchTree provides an insert() method.)
        int[] values = {50, 30, 70, 20, 40, 60, 80, 99, 100, 101, 101};
        for (int value : values) {
            bst.insert(value);
        }
        
        // Test the height() method.
        System.out.println("Height of BST: " + bst.height());
        
        // Test the imbalance() method.
        // For a balanced BST this should return null.
        Integer imbalance = bst.imbalance();
        if (imbalance == null) {
            System.out.println("BST is balanced.");
        } else {
            System.out.println("Imbalance found at node with value: " + imbalance);
        }
        
        // Test the smallestGreaterThan(T t) method.
        int testValue = 65;
        Integer smallestGreater = bst.smallestGreaterThan(testValue);
        if (smallestGreater != null) {
            System.out.println("Smallest element greater than " + testValue + ": " + smallestGreater);
        } else {
            System.out.println("No element found that is greater than " + testValue);
        }

        Integer largestSmaller = bst.largestSmallerThan(testValue);
        if (largestSmaller != null) {
            System.out.println("Largest element smaller than " + testValue + ": " + largestSmaller);
        } else {
            System.out.println("No element found that is smaller than " + testValue);
        }
        
        // Test the mirror() method.
        BinarySearchTree<Integer> mirrorBST = bst.mirror();
        System.out.println("\nOriginal BST level order traversal:");
        printLevelOrder(bst);
        System.out.println("Mirror BST level order traversal:");
        printLevelOrder(mirrorBST);
        
        // Test the levelOrderTraversal() method separately.
        System.out.println("\nLevel order traversal (original BST):");
        LinkedList<BinarySearchTree.BinaryNode<Integer>> levelOrderList = bst.levelOrderTraversal();
        for (BinarySearchTree.BinaryNode<Integer> node : levelOrderList) {
            System.out.print(node.data + " ");
        }
        System.out.println();
    }
    
    // Utility method to print level order traversal of a BST.
    public static void printLevelOrder(BinarySearchTree<Integer> bst) {
        LinkedList<BinarySearchTree.BinaryNode<Integer>> levelOrder = bst.levelOrderTraversal();
        if (levelOrder != null && !levelOrder.isEmpty()) {
            for (BinarySearchTree.BinaryNode<Integer> node : levelOrder) {
                System.out.print(node.data + " ");
            }
            System.out.println();
        } else {
            System.out.println("Tree is empty.");
        }
    }
}
