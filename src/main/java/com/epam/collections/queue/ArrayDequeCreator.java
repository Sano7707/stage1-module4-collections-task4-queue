package com.epam.collections.queue;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(firstQueue.remove());
        deque.add(firstQueue.remove());
        deque.add(secondQueue.remove());
        deque.add(secondQueue.remove());

        int i = 0;
        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()){
            if(i % 2 == 0){
                firstQueue.add(deque.removeLast());
                deque.add(firstQueue.remove());
                deque.add(firstQueue.remove());
            }
            else {
                secondQueue.add(deque.removeLast());
                deque.add(secondQueue.remove());
                deque.add(secondQueue.remove());
            }
            i++;
        }
        return deque;
    }



}
