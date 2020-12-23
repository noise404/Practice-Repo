package com.company;

/**
 * Class that dictates the structure of the queue
 */
public class Queue <E> {
    /**
     * Variables that will be used for multiple methods
     * Set to private so they can't be accessed outside of the class
     */
    private Node head;
    private Node tail;
    private int count;
    private E item;

    /**
     * Enqueue accepts a string as arguement
     * Creates a node using the string and adds it to the queue
     */
    public void enQueue(E data){
        Node node = new Node(data);


        //  If tail is not null, set the current tail to point to newly created node

        if(tail != null){
            tail.setNext(node);
        }

        //  Set new node to tail

        tail = node;

        // If head is null the newly created node is set to head, starting a new queue

        if(head == null){
            head = node;
        }

        // Keeps track of how many items are added to the queue

        count++;
    }

    /**
     * Dequeue removes nodes from the front of the queue
     * Returns the data from the removed node
     */
    public E deQueue(){

        // Retrieves the data from head, then sets the next node as the new head
        item = (E) head.getData();
        head = head.getNext();
        // If the head is null then the list is empty, so set the tail to null
        if(head == null){
            tail = null;
        }
        //Decrease the count every time a node is removed from the queue
        count --;
        return item;
    }

    /**
     * Checks to see if head is null, if so then queue is empty
     */
    public boolean isEmpty(){
        return head == null;
    }

    /**
     * Returns the size of current queue
     */
    public int getCount(){
        return count;
    }

    /**
     * Searches the queue for the string passed as the arguement
     */
    /** Search method is commented out, due to assignment not stating that it is not required
     */
    /**public boolean search(String seek){
        //Current keeps track of the node being accessed in the search
        Node current = head;
        //Found boolean, defaults to false
        boolean found = false;

        //Int used to for search counter, to be compared against queue size
        int i = 0;

        // While loop runs until either the item is found, or it has iterated through the entire queue
            while(i < count && !found) {

                // Compares the data of the current node to the search term, if it matches then found is set to true
                if (current.getData().equalsIgnoreCase(seek)){
                    found = true;
                }

                // If the previous comparison failed, get next node and increment search counter
                else{
                    current = current.getNext();
                    i++;
            }
            }
        //Return result of search
        return found;
    }**/
}
