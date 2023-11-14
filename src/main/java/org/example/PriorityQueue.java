package org.example;

import java.util.Arrays;

public class PriorityQueue {
    private int[] values;
    private int count;


    public PriorityQueue(int size) {
        this.values = new int[size];
    }

    public void insert(int value){
        if(isFull()){
            throw new IllegalStateException();
        }
        for(int i=count; i>=0; i--){
            if(i==0){
                values[0] = value;
            }
            else if(values[i-1] > value){
                values[i] = values[i-1];
            }
            else{
                values[i] = value;
                break;
            }
        }
        count++;
    }

    public void remove(){
        if(isEmpty()){
            throw new IllegalStateException();
        }

        int removed = values[0];
        for(int i=0; i<count-1; i++){
            values[i] = values[i+1];
        }
        values[count-1] = 0;
        count--;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == values.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}

