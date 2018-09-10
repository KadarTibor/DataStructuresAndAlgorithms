package com.kdrt.trees;


public class BinarySearchTree {

    public BinarySearchTree() {

    }

    /**
     * Pretty print the binary search trees
     */
    public void printBinaryTree(Node root) {

        //TODO implement BFS on the trees structure

        if (root != null) {
            if (root.getLeft() != null) {
                printBinaryTree(root.getLeft());
            }
        }

    }


    public void printInorder(Node root, int level) {
        if(root != null) {
            printInorder(root.getLeft(), level + 1);
            for(int i = 0; i < level; i++) {
                System.out.print(" ");
            }
            System.out.print(root.getKey() + "\n");
            printInorder(root.getRight(), level + 1);
        }
    }

    /**
     * Implement a function to check if a tree is balanced.
     * For the purposes of this question, a balanced tree is defined to
     * be a tree such that no two leaf nodes differ in distance from the root by more than one.
     */
    public boolean checkBalanced(Node root) {
        return Math.abs(minDepth(root) - maxDepth(root)) <= 1;
    }

    private int minDepth(Node root) {
        if(root != null) {
            return 1 + Math.min(minDepth(root.getLeft()), minDepth(root.getRight()));
        } else
            return 0;
    }

    private int maxDepth(Node root) {
        if(root != null) {
            return 1 + Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
        } else
            return 0;
    }

    private int calculateHeight(Node root) {
        if(root.getLeft() != null || root.getRight() != null)
            return calculateHeight(root.getLeft()) + calculateHeight(root.getRight()) + 1;
        else
            return 0;
    }



}
