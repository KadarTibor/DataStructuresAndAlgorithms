package com.kdrt.heaps;

import java.util.Random;

public class HeapImpl {

    int[] array;
    int size;

    public HeapImpl(int size) {
        this.size = size;
        array = new int[size];
        Random random = new Random(5);
        for(int i = 0; i < size; i++) {
            array[i] = Math.abs(random.nextInt() % 100);
        }
    }

    public void printHeap(){
        for(int val: array) {
            System.out.print(val + " ");
        }
        System.out.println("\n");
    }

    public void heapify(int indexOfRoot) {

        System.out.println("heapify at index " + indexOfRoot);

        int maxVal = indexOfRoot;

        int leftChildIndex = getLeftChild(indexOfRoot);
        if( leftChildIndex < size && array[indexOfRoot] < array[leftChildIndex]) {
            maxVal = leftChildIndex;
        }

        int rightChildIndex = getRightChild(indexOfRoot);
        if(rightChildIndex < size && array[indexOfRoot] < array[rightChildIndex]) {
            maxVal = rightChildIndex;
        }

        if(indexOfRoot != maxVal) {
            //found that the head was corrupted
            int swap = array[maxVal];
            array[maxVal] = array[indexOfRoot];
            array[indexOfRoot] = swap;

            //heapify further down
            heapify(maxVal);
        }
    }

    public void buildHeap() {
        for(int i = size / 2; i >= 0; i--) {
            heapify(i);
        }
    }


    private int getLeftChild(int rootIndex) {
        return rootIndex * 2 + 1;
    }

    private int getRightChild(int rootIndex) {
        return rootIndex * 2 + 2;
    }

}
