package org.example;

import java.util.Stack;

public class QueueWithTwoStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    //enqueue
    public void enqueue(int value){
        stack1.push(value);
    }

    //dequeue
    public int dequeue(){
        if(this.isEmpty()){
            throw new IllegalStateException();
        }
        moveStack1toStack2();
        return stack2.pop();
    }

    //peek
    public int peek(){        
        if(this.isEmpty()){
            throw new IllegalStateException();
    }
        moveStack1toStack2();
        return stack2.peek();
    }

    //isEmpty
    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void moveStack1toStack2() {
        if(stack2.isEmpty())
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());
    }


}
