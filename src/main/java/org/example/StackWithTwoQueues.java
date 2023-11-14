package org.example;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackWithTwoQueues {
    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();
    public int count;

    //Push
    public void push(int value) {
        if (!queue1.isEmpty()) {
            queue1.add(value);
            count++;
        } else {
            queue2.add(value);
            count++;
        }
    }

    //Pop
    public void pop(){
        if(queue1.isEmpty() && queue2.isEmpty()){
            throw new IllegalStateException();
        }
        if(!queue1.isEmpty()) {
            moveNodesFromFirstToSecond(queue1, queue2);
        }
        else {
            moveNodesFromFirstToSecond(queue2, queue1);
        }
        count--;
    }

    //Peek
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        else if(!queue1.isEmpty()){
            return queue1.peek();
        }
        else{
            return queue2.peek();
        }
    }

    //Size
    public int size(){
        return count;
    }

    // isEmpty
    public boolean isEmpty(){
        return count == 0;
    }

    private void moveNodesFromFirstToSecond(Queue<Integer> queue1, Queue<Integer> queue2) {
        while (queue1.size() > 1) {
            var poppedNode = queue1.remove();
            queue2.add(poppedNode);
        }
        queue1.remove();
    }
}
