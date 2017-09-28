package com.example.java;

/**
 * Created by Christopher on 7/26/2017.
 */
public class LinkedListNode {

    public Object data;
    public LinkedListNode next;
    public LinkedListNode head;

    public LinkedListNode(){
//        this.head = new LinkedListNode();
//        LinkedListNode node = new LinkedListNode();
    }

    public LinkedListNode(Object data){
        this.data = data;
    }

    public void addNode(Object e){
        LinkedListNode node = new LinkedListNode();
//        node.next = head.next;
        node.data = e;
//        head.next = node;

    }

}
