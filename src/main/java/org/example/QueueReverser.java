package org.example;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser {



    public static void reverse(Queue<Integer> queue, int k) {
        if(queue.isEmpty()){
            throw new IllegalStateException();
        }
        if(queue.size()<k){
            throw new IllegalArgumentException();
        }

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> reversedQueue = new ArrayDeque<>();

        for(int i=0; i<k; i++){
            var itemRemoved = queue.remove();
            stack.push(itemRemoved);
        }
        while(!stack.isEmpty()){
            var itemRemoved = stack.pop();
            reversedQueue.add(itemRemoved);
        }
        while(!queue.isEmpty()){
            var itemRemoved = queue.remove();
            reversedQueue.add(itemRemoved);
        }

        System.out.println(reversedQueue);
    }

}
