package com.company;
//Node class to be used in the Queues linked list
public class Node <T>{
    /**Data contains the Object unique to each node
     * next links to the next node in the list
     */
    private T data;
    private Node next;

    //Constructor to be used to create the list
    public Node(T data){
        this.data = data;
    }

    //Basic accessors/mutators for acessing and altering the node data
    public void setData(T sIn){ data = sIn; }
    public void setNext(Node nIn){ next = nIn; }
    public T getData(){ return data; }
    public Node getNext(){ return next; }
}
