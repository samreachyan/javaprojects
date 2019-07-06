/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThinkOfObject;

/**
 *
 * @author Samreach Yan
 */
public class StackOfIntegers {
    private int [] elements;
    private int size;
    public static final int DEFAULT =16;
    
    public StackOfIntegers ( int capacity){
        elements = new int [capacity];
    }

    public StackOfIntegers() {
        this(DEFAULT);
    }
    
    public void push (int value){
        if (size >= elements.length){
            int [] temp = new int [elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
             elements = temp ;
        }
        elements[size++] = value;
    }
    
    public int pop(){
        return elements[--size];
    }
    
    public int peek(){
        return elements[size-1];
    }
    
    public boolean empty(){
        return size == 0;
    }
    
    public int getSize(){
        return size;
    }   
}