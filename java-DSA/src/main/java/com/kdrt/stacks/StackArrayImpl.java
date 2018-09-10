package com.kdrt.stacks;

public class StackArrayImpl {

    private int nrOfStacks;
    private int sizeOfStack;
    private int sizeOfArray;
    private int[] stacks;
    private int[] pointers = new int[3];


    public StackArrayImpl(int nrOfStacks, int sizeOfStack) {
        this.nrOfStacks = nrOfStacks;
        this.sizeOfStack = sizeOfStack;
        this.sizeOfArray = nrOfStacks * sizeOfStack;
        this.stacks = new int[sizeOfArray];
    }

    public void push(int stackNumber,int val) {
        if(stackNumber * sizeOfStack + pointers[stackNumber] + 1 < sizeOfArray - sizeOfStack) {
            stacks[stackNumber * sizeOfStack + pointers[stackNumber] + 1] = val;
            pointers[stackNumber]++;
        }
    }

    public int pop(int stackNumber) {
        int val = stacks[stackNumber * sizeOfStack + pointers[stackNumber]];
        stacks[stackNumber * sizeOfStack + pointers[stackNumber]] = 0;
        pointers[stackNumber]--;
        return val;
    }
}
