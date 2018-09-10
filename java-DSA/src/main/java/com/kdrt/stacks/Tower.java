package com.kdrt.stacks;

import java.util.ArrayList;
import java.util.List;

public class Tower {

    private List<Character> stack;

    public Tower() {
        stack = new ArrayList<>();
    }

    public void push(char disk) {
        stack.add(disk);
    }

    public char pop() {
        char val = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);

        return val;
    }

    public void printTower() {
        stack.forEach(System.out::println);
    }
}
