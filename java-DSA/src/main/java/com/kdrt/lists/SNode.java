package com.kdrt.lists;

public class SNode {

  private int key;
  private SNode next;

  public SNode(int key) {
    this.key = key;
    this.next = null;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public SNode getNext() {
    return next;
  }

  public void setNext(SNode next) {
    this.next = next;
  }

  public void appendTail(int key) {
    if(this.next == null) {
      this.next = new SNode(key);
    } else {
        SNode iterator = next;
        while(iterator.getNext() != null) {
          iterator = iterator.getNext();
        }

        iterator.setNext(new SNode(key));
    }
  }

  public void appendTail(SNode list) {
    if(this.next == null) {
      this.next = list;
    } else {
        SNode iterator = next;
        while(iterator.getNext() != null) {
          iterator = iterator.getNext();
        }

        iterator.setNext(list);
    }
  }

  public void printList() {
    SNode iterator = this;
    while(iterator != null) {
      System.out.print("(" + iterator.getKey() + ")->");
      iterator = iterator.getNext();
    }
    System.out.print("|\n");
  }

}
