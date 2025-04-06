import java.util.LinkedList;
import java.util.Queue;
import java.util.HashSet;

public class BetterBST<T extends Comparable<? super T>> extends BinarySearchTree<T>{
    
    // public driver method
    public int height(){
        return findHeight(root);
    }

    // private recursive method
    private int findHeight(BinaryNode<T> t){
        if(t == null){
            return -1;
        }
        // we find the height of both subtrees, take whichever is higher
        // then we add 1 for our root
        return Math.max(findHeight(t.left), findHeight(t.right)) + 1;
    }

    // public driver method
	public T imbalance(){        
        return imbalance(root).imbalanceNodeData;
    }

    private class BalanceStatus{
        int height;
        T imbalanceNodeData;
        BalanceStatus(int height, T imbalanceNodeData){
            this.height = height;
            this.imbalanceNodeData = imbalanceNodeData;
        }
    }

    // private recursive method
	private BalanceStatus imbalance(BinaryNode<T> t){
        
        // if the root is null, there's trivially no imbalance
        if(t==null)
            return new BalanceStatus(-1, null);
        
        
        BalanceStatus left = imbalance(t.left);
        if(left.imbalanceNodeData!=null)
            return left;

        BalanceStatus right = imbalance(t.right);
        if(right.imbalanceNodeData!=null)
            return right;

        // this is where the real work happens
        // if we detect a height difference then return a new imbalance
        int heightDiff = Math.abs(left.height - right.height);
        if (heightDiff > 1)
            return new BalanceStatus(-1, t.data);

        // in any case we create a BalanceStatus object for current node
        // we can access the left.height and right.height objects and we add one for the current node
        // then we have our new balance status object that we can return up to the next caller
        int currHeight = Math.max(left.height, right.height) + 1;
        return new BalanceStatus(currHeight, null);        
    }

    // public driver method
	public T smallestGreaterThan(T t){
        return smallestGreaterThan(t, root);
    }

    // private recursive method
	private T smallestGreaterThan(T t, BinaryNode<T> root){
        if (root==null) {
            return null;
        }
    
        if (root.data.compareTo(t) <= 0) {
            return smallestGreaterThan(t, root.right);
        } else {
            // fill in: try to find a smaller candidate in the left subtree
            T candidate = smallestGreaterThan(t, root.left);
    
            if (candidate != null) {
                return candidate;
            } else {
                return root.data;
            }
        }
    }

    public T largestSmallerThan(T t){
        return largestSmallerThan(t, root);
    }

    private T largestSmallerThan(T t, BinaryNode<T> root){
        if(root == null){
            return null;
        }

        if(root.data.compareTo(t) >= 0)
            return largestSmallerThan(t, root.left);
        T candidate = largestSmallerThan(t, root.right);
        if(candidate!=null)
            return candidate;
        return root.data;
    }

    // public driver method for mirror
    public BinarySearchTree<T> mirror(){
        BinarySearchTree<T> mirrorBST = new BetterBST<>();
        mirrorBST.root = mirror(root);
        return mirrorBST;
    }

    // private recursive method for mirror
    private BinaryNode<T> mirror(BinaryNode<T> t){
        // if t is null, there is nothing to mirror
        if(t==null)
            return null;
        
        // create our new tree strarting with the newRoot
        // for each subsequent call to mirror, we add a node
        BinaryNode<T> newRoot = new BinaryNode<T>(t.data);

        // flip the children for each node
        newRoot.left = mirror(t.right);
        newRoot.right = mirror(t.left);

        return newRoot;
    }

    // public driver method for level traversal
	public LinkedList<BinaryNode<T>> levelOrderTraversal(){
        return levelOrderTraversal(root);
    }

    // level order method using BFS algorithm
	public LinkedList<BinaryNode<T>> levelOrderTraversal(BinaryNode<T> t){
        // first we create a LinkedList of nodes we've seen
        LinkedList<BinaryNode<T>> visited = new LinkedList<>();
        // if the root we pass in is null, nothing to see here
        if(t== null){
            return null;
        }
        // assuming we have someting to work with, create a "queue" 
        // but really its a LinkedList that we're using like a queue
        // the offer and poll methods will come in handy here
        LinkedList<BinaryNode<T>> queue = new LinkedList<>();

        // offer (aka enqueue) our root
        queue.offer(t);

        // our queue will keep track of nodes we need to visit
        while (!queue.isEmpty()) {
            // the queue isn't empty, so we poll the first element
            BinaryNode<T> current = queue.poll();
            // now we search it's left child for an additional element to offer
            if(current.left != null){
                queue.offer(current.left);
            }
            // now we search it's right child for an additional element to offer
            if(current.right != null){
                queue.offer(current.right);
            }
            // lastly, we offer our current node onto the visited LinkedList
            // this is what we'll eventually return
            visited.offer(current);
        }
        return visited;
    }

}
