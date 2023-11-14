package org.example;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }


    public static void reverse(Queue<Integer> queue) {
        //add, remove, isEmpty
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> reversedQueue = new ArrayDeque<>();
        while(!queue.isEmpty())
            stack.push(queue.remove());
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}
