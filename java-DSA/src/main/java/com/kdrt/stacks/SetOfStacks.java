package com.kdrt.stacks;

import java.util.ArrayList;
import java.util.List;

public class SetOfStacks {

    private List<List<Integer>>  stacks;
    private int stackSize;
    private int stackTiles = 0;

    public  SetOfStacks(int stackSize) {
        this.stackSize = stackSize;
        stacks = new ArrayList<>();
        stacks.add(new ArrayList<>());
    }

    public void push(int val) {
        List<Integer> currentTile = stacks.get(stackSize);
        if(currentTile.size() <= stackSize) {
            currentTile.add(val);
        } else {
            List<Integer> newTile = new ArrayList<>();
            newTile.add(val);
            stacks.add(newTile);
            stackTiles++;
        }
    }


    public int pop() {
        List<Integer>  currentTile = stacks.get(stackTiles);
        if(currentTile.size() > 0) {
            int val = currentTile.get(currentTile.size() - 1);
            currentTile.remove(currentTile.size() - 1);
            return val;
        } else if(stackTiles > 0){
            stackTiles--;
            currentTile = stacks.get(stackTiles);
            currentTile.remove(stacks.size() - 1);
            int val = currentTile.get(currentTile.size() - 1);
            currentTile.remove(currentTile.size() - 1);
            return val;
        } else {
            //the stack is emptied
            return -1;
        }
    }

    public int popAt(int index) {
        if(index > stackTiles) {
            return -1; //we dont have that many tiles
        }
        List<Integer> currentTile = stacks.get(index);
        int val = currentTile.get(currentTile.size() - 1);
        currentTile.remove(currentTile.size() - 1);
        List<Integer> nextTile;

        for(int i = index; i < stackTiles; i++) {
            currentTile = stacks.get(i);
            nextTile = stacks.get(i + 1);
            currentTile.add(nextTile.get(0));
            nextTile.remove(0);
        }
        return val;
    }
}
