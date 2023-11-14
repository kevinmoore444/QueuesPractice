package org.example;

import java.util.Arrays;

public class ArrayQueue {
    private int front = 0;
    private int back = 0;
    private int count = 0;
    private int[] values;

    public ArrayQueue(int size) {
        this.values = new int[size];
    }

    //Enqueue
    public void enqueue(int value){
        if(this.isFull()){
            throw new IllegalStateException();
        }
        this.values[this.back] = value;
        this.back = (back+1) % this.values.length;
        this.count++;

        if(this.back >= values.length){
            this.back= 0;
        }
    }
    //Dequeue
    public int dequeue(){
        if(this.isEmpty()){
            throw new IllegalStateException();
        }
        this.values[this.front] = 0;
        front = (front + 1) % this.values.length;
        this.count--;

        return this.values[this.front];
    }
    //Peek
    public int peek(){
        if(this.isEmpty()){
            throw new IllegalStateException();
        }
        return this.values[this.front];
    }

    //isEmpty
    public boolean isEmpty(){
        return count == 0;
    }

    //isFull
    public boolean isFull(){
        return count == this.values.length;
    }


    @Override
    public String toString() {
        return Arrays.toString(this.values);
    }
}
