package com.company;

/**
 * This program loads data from a predefined array into a stack structure
 * Set up to accept Generic objects, such that it can be used with near any type of data
 * In this example an array of string objects is used
 */

public class Main {

    public static void main(String[] args) {

        /**
         * String array, with data specified in the assignment
         */
        String cities[] = { "Philadelphia, PA", "Harrisburg, PA", "Pittsburg, PA",
                "Cleveland, OH", "Toledo, OH", "Gary, IN", "Chicago, IL"};


        /**
         * Instantiation of StringStack to be used
         */
        GenericStack testStack = new GenericStack();

        /**
         * Calls method defined below to cycle through and print the cities array with formatting
         */
        //printArr(cities);

        /**
         * Loops through the cities array calling the push method, defined in StringStack
         * Sends the data at each index to the testStack data structure
         */
        for (int i = 0; i < cities.length; i++){
            testStack.push(cities[i]);
        }

        /**
         * Loops through the cities array, calling the pop method defined in GenericStack
         * Replaces the data at each index with the data popped from testStack
         */
        for (int i = 0; i < cities.length; i++){
            cities[i] = (String) testStack.pop();
        }

        /**
         * Calls method defined below to cycle through and print the cities array with formatting
         */
        //printArr(cities);

        /**
         * Instantiation of queue to be used
         */
        Queue testQueue = new Queue();

        /**
         * Loops through the array, adding each index to the queue
         */
        for (int i = 0; i < cities.length; i++) {
            testQueue.enQueue(cities[i]);
            System.out.println("Queued: "  + cities[i] + ", Queue size: " + testQueue.getCount());
        }


        /**
         * While the queue is not empty, loop through and dequeue
         */
        while (!testQueue.isEmpty()){
            System.out.println("Dequeued: " + testQueue.deQueue() + ", Queue size: " + testQueue.getCount());
        }


    }

    /**
     * Method to print the array passed as arguement with simple formatting
     * Loops through the length of the array, printing each index
     */
    static public void printArr(String[] arrIn){
        System.out.println("Printing Path from " + arrIn[0] + " to " + arrIn[arrIn.length-1]);
        for (int i = 0; i < arrIn.length; i++) {
            System.out.println("City #" + (i + 1) + ": " + arrIn[i]);
        }
    }
}
