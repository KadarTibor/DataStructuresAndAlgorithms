package com.kdrt.lists;

public class ListUtilsTestCase {

  public static void main(String[] args) {
    ListUtils listUtils = new ListUtils();

    SNode list = new SNode(1);

    list.appendTail(10);
    list.appendTail(5);
    list.appendTail(5);
    list.appendTail(15);
    list.appendTail(1);
    list.appendTail(15);
    list.appendTail(10);
    list.appendTail(10);
    list.appendTail(3);

    list.printList();

    listUtils.removeDuplicates(list);

    list.printList();

    SNode nth = listUtils.findNthToLast(list, 3);

    System.out.println("the 3rd from last node is " + nth.getKey());

    System.out.println(list.getNext().getNext().getKey());

    listUtils.deleteMiddleNode(list.getNext().getNext());

    list.printList();

    SNode nr1 = new SNode(3);
    nr1.appendTail(1);
    nr1.appendTail(5);
    nr1.appendTail(1);
    nr1.appendTail(1);

    SNode nr2 = new SNode(5);
    nr2.appendTail(9);
    nr2.appendTail(2);
    nr2.appendTail(2);

    SNode result = listUtils.addNumbersAsLists(nr1, nr2);

    result.printList();
  }
}
