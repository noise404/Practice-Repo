package com.company;

/**
 * GenericStack Class defining the structure of the stack to be created
 * Uses G for generic object
 */
public class GenericStack <G> {
    /**
     * Private variables to be used within the class
     * Generic Object array for specified size of the input
     * Int variable used in multiple methods to determine if the stack is empty or full
     */
    private G[] stack = (G[])new Object[7];
    private int sp = -1;

    /**
     * Push method, accepting an Object as argument
     * Calls method to check if the stack is full
     * If not full, appends arguement to Stack and increment sp up
     * If full, print error message
     */
    public void push(G stIn){
        if (!this.isFull()){
            stack[sp+1] = stIn;
            sp++;
        }
        else
            System.out.println("Stack is full");
    }

    /**
     * Pop method, returning an Object
     * Calls method to check if the stack is empty
     * If not empty, return the top item of the stack and increment sp down
     * If empty, print error message and return null
     */
    public G pop(){
        G returnItem;
        if (!this.isEmpty()){
            returnItem = stack[sp];
            sp--;
            return returnItem;
        }
        else
            System.out.println("Stack is empty, returning null");
            return null;
    }

    /**
     * Methods to check if the stack is empty
     * isEmpty method compares sp against -1 to check if it has gone out of bounds
     * Used in the pop method, to prevent popping from an empty stack
     */
    private boolean isEmpty(){
        if(sp == -1){
            return true;
        }
        else
            return false;
    }

    /**
     * Method to check if the stack is full
     * isFull method compares sp against the size of the stack array to check if it has reached the limit
     * Used in the push method, to prevent going out of bounds while adding to the stack
     */
    private boolean isFull(){
        if (sp == stack.length-1){
            return true;
        }
        else
            return false;
    }
}
