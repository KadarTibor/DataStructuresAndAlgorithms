package com.kdrt.lists;

public class ListUtils {

    public ListUtils() {
    }


    /**
     * Write code to remove duplicates from an unsorted linked list.
     * FOLLOW UP
     * How would you solve this problem if a temporary buffer is not allowed?
     */
    public void removeDuplicates(SNode list) {
        SNode iterator = list;
        while (iterator != null) {
            removeKeys(iterator.getKey(), iterator);
            iterator = iterator.getNext();

        }
    }


    private void removeKeys(int key, SNode list) {
        SNode prev = list;
        SNode current = prev.getNext();

        while (current != null) {
            if (current.getKey() == key) {
                prev.setNext(current.getNext());
                current = current.getNext();
                continue;
            }
            prev = current;
            current = current.getNext();
        }
    }

    /**
     * Implement an algorithm to find the nth to last element of a singly linked list.
     */
    public SNode findNthToLast(SNode list, int n) {
        SNode firstIterator = list;
        for (int i = 0; i < n; i++) {
            firstIterator = firstIterator.getNext();
        }

        SNode secondIterator = list;

        while (firstIterator != null) {
            firstIterator = firstIterator.getNext();
            secondIterator = secondIterator.getNext();
        }

        return secondIterator;
    }

    /**
     * Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
     * EXAMPLE
     * Input: the node ‘c’ from the linked list a->b->c->d->e
     * Result: nothing is returned, but the new linked list looks like a->b->d->e
     */
    public void deleteMiddleNode(SNode middleNode) {
        if (middleNode.getNext() == null) {
            return;//can't delete the last node in the list
        } else {
            System.out.println(middleNode.getNext().getKey());
            middleNode.setKey(middleNode.getNext().getKey());
            System.out.println(middleNode.getKey());
            middleNode.setNext(middleNode.getNext().getNext());
        }
    }

    /**
     * You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored
     * in reverse order, such that the 1’s digit is at the head of the list. Write a function that adds the two numbers
     * and returns the sum as a linked list.
     * EXAMPLE
     * Input: (3 -> 1 -> 5), (5 -> 9 -> 2)
     * Output: 8 -> 0 -> 8
     */
    public SNode addNumbersAsLists(SNode nr1, SNode nr2) {
        SNode result = null;
        int carry = 0;
        while (nr1 != null && nr2 != null) {
            int val = (carry + nr1.getKey() + nr2.getKey()) % 10;
            carry = (carry + nr1.getKey() + nr2.getKey()) / 10;
            if (result == null) {
                result = new SNode(val);
            } else {
                result.appendTail(val);
            }

            if (nr1.getNext() == null) {
                resolveLists(result, nr2, carry);
                break;
            }

            if (nr2.getNext() == null) {
                resolveLists(result, nr1, carry);
                break;
            }

            nr1 = nr1.getNext();
            nr2 = nr2.getNext();
        }

        return result;
    }

    private void resolveLists(SNode result, SNode toAppend, int carry) {
        if (toAppend.getNext() != null) {
            toAppend.getNext().setKey(toAppend.getNext().getKey() + carry);
            result.appendTail(toAppend.getNext());
        } else {
            result.appendTail(carry);
        }

    }
}
