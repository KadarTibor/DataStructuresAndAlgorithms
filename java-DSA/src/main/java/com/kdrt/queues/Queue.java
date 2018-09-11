package com.kdrt.queues;

import java.util.ArrayList;
import java.util.List;

public class Queue<E> {

    List<E> list;

    public Queue() {
        list = new ArrayList<>();
    }

    public Queue(E firstVal) {
        list = new ArrayList<>();
        list.add(firstVal);
    }

    public void enqueue(E val) {
        list.add(val);
    }

    public E dequeue(){
        E val =  list.get(0);
        list.remove(0);
        return val;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
