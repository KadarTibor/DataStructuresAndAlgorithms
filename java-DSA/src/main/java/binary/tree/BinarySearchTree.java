package binary.tree;


public class BinarySearchTree {

  public BinarySearchTree() {

  }

  /**
  * Pretty print the binary search tree
  */
  public void printBinaryTree(Node root) {

      //TODO implement BFS on the tree structure

      if(root != null) {
        if(root.getLeft() != null) {
          printBinaryTree(root.getLeft());
        }
      }

  }


}
