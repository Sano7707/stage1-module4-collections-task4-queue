package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> pq = new PriorityQueue<>(new ComparatorString());
        List<String> all = new ArrayList<>();
        all.addAll(firstList);
        all.addAll(secondList);
        while (!all.isEmpty()){
            pq.add(all.remove(0));
        }
        return pq;
    }

    static class ComparatorString implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
             if(o1.compareTo(o2) >0){
                 return -1;
             }
             else if(o1.compareTo(o2) <0){
                 return 1;
        }
        return 0;
    }

}
    }
