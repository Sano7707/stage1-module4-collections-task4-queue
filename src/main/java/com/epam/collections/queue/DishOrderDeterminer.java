package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        Deque<Integer> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            queue.addLast(i);
        }

        int i = 1;

        while (!queue.isEmpty()){
            if(i % everyDishNumberToEat == 0){
                list.add(queue.removeFirst());
                i = 0;
            }
            else
            {
                queue.addLast(queue.removeFirst());
            }
            i++;
        }
       return list;
    }

}
