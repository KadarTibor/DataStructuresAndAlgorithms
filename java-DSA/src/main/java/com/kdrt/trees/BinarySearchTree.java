package com.kdrt.trees;


import com.kdrt.queues.Queue;

import java.util.Stack;

public class BinarySearchTree {

    public BinarySearchTree() {

    }

    /**
     * Pretty print the binary search trees
     */
    public void printBinaryTreeBFS(Node root) {

        Queue<Node> qu = new Queue<>();
        qu.enqueue(root);

        //we have 1 element as root for sure
        int currentLevelCount = 1;
        //we don't know how many elements are on the next level
        int nextLevelCount = 0;;

        while (!qu.isEmpty()) {
            Node currentNode = qu.dequeue();
            System.out.print(currentNode.getKey() + "  ");
            if (currentNode.getRight() != null) {
                qu.enqueue(currentNode.getRight());
                nextLevelCount++;
            }

            if (currentNode.getLeft() != null) {
                qu.enqueue(currentNode.getLeft());
                nextLevelCount++;
            }
            currentLevelCount--;
            if (currentLevelCount == 0) {
                System.out.print("\n");
                currentLevelCount = nextLevelCount;
                nextLevelCount = 0;
            }
        }
    }

    /**
     * Print the order of nodes in a tree when parsed with DFS
     * @param root
     */
    public void printBianryTreeDFS(Node root) {
        Stack<Node> stack = new Stack<>();

        while(!stack.isEmpty()) {

            Node currentNode = stack.pop();
            System.out.println(currentNode.getKey() + " - ");
            if(currentNode.getLeft() != null) {
                stack.push(currentNode.getLeft());
            }

            if(currentNode.getRight() != null) {
                stack.push(currentNode.getRight());
            }
        }
    }

    public void printInorder(Node root, int level) {
        if (root != null) {
            printInorder(root.getLeft(), level + 1);
            for (int i = 0; i < level; i++) {
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
        if (root != null) {
            return 1 + Math.min(minDepth(root.getLeft()), minDepth(root.getRight()));
        } else
            return 0;
    }

    private int maxDepth(Node root) {
        if (root != null) {
            return 1 + Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
        } else
            return 0;
    }

    private int calculateHeight(Node root) {
        if (root.getLeft() != null || root.getRight() != null)
            return calculateHeight(root.getLeft()) + calculateHeight(root.getRight()) + 1;
        else
            return 0;
    }


}
