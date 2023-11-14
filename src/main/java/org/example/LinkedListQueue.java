package org.example;

import java.util.NoSuchElementException;

public class LinkedListQueue {
    //Node Class
    private class Node {
        private int value;
        private Node next;

        //Node Constructor
        public Node(int value) {
            this.value = value;
        }
    }
    //Linked List Attributes
    private Node first;
    private Node last;
    private int count = 0;


    //enqueue Method - add node to back
    public void enqueue(int value){
        Node newNode = new Node(value);
        //If Linked List is Empty
        if(this.isEmpty()){
            first = last = newNode;
            count++;
        }
        else{
            last.next = newNode;
            last = newNode;
            count++;
        }
    }


    //dequeue - remove node from front.
    public int dequeue(){
        var popped = first.value;
        if(this.isEmpty()){
            throw new NoSuchElementException();
        }
        else if(first == last){
            first = last = null;
            count--;
        }
        else {
            var second = first.next;
            first.next = null;
            first = second;
            count--;
        }
        return popped;
    }

    //peek
    public int peek(){
        return first.value;
    }

    //size
    public int size(){
        return count;
    }

    //isEmpty
    public boolean isEmpty(){
        return count==0;
    }
}

