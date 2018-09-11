package com.kdrt.heaps;

public class HeapImplTestCase {

    public static void main(String[] args) {
        HeapImpl heap = new HeapImpl(10);

        heap.printHeap();

        heap.buildHeap();

        heap.printHeap();
    }
}
