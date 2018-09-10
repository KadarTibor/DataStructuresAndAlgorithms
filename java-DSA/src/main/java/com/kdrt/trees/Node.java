package com.kdrt.trees;

public class Node {

  private int key;
  private Node left;
  private Node right;

  public Node(int key) {
      this.key = key;
  }

  public Node(Node left, int key, Node right) {
    this.left = left;
    this.key = key;
    this.right = right;
  }

  public Node getLeft() {
    return left;
  }

  public Node getRight() {
    return right;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public void setLeft(Node newLeft) {
    left = newLeft;
  }

  public void setRight(Node newRight) {
    right = newRight;
  }

}
