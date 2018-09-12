package com.kdrt.trees;

public class BinarySearchTreeTestCase {

    public static void main(String[] args) {
        BinarySearchTree bs = new BinarySearchTree();

        Node root = new Node(new Node(new Node(10),11, new Node(13)),15, new Node(new Node(new Node(17), 18, new Node(19)), 20, new Node(21)));

        bs.printInorder(root, 0);

//        if(bs.checkBalanced(root)) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }

        bs.printBinaryTreeBFS(root);
    }
}
