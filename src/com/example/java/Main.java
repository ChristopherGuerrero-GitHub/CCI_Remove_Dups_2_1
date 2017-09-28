package com.example.java;

import com.sun.javafx.collections.ListListenerHelper;

import java.util.HashSet;


public class Main {

    public static void main(String[] args) {

        /*
            This program is a solution to CCI book problem 2.1 Remove Duplicates. Created a LinkedListNode chain of a
            string data types. Then invoke the deleteDups method and pass the LinkedListNode chain as a parameter
            and create a HashSet object and create another LinkedListNode previous. Check to see if the HashSet already
            contains the the node string data. If it unique string then add to the HashSet and move the node pointer
            to next node. If HashSet already contains the node string data then skip node by assigning previous next
            pointer to node next pointer.
         */


        //Create the object LinkedListNodes data type
        LinkedListNode node_1 = new LinkedListNode("Tiger");
        LinkedListNode node_2 = new LinkedListNode("Wolf");
        LinkedListNode node_3 = new LinkedListNode("Dragon");
        LinkedListNode node_4 = new LinkedListNode("Eagle");
        LinkedListNode node_5 = new LinkedListNode("Bear");
        LinkedListNode node_6 = new LinkedListNode("Eagle");
        LinkedListNode node_7 = new LinkedListNode("Tiger");
        LinkedListNode node_8 = new LinkedListNode("Tiger");

        //Assign the LinkList Nodes into a chain.
        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;
        node_5.next = node_6;
        node_6.next = node_7;
        node_7.next = node_8;

        //Create a LinkList node type variable reference to traverse through the LinkedList.
        LinkedListNode curr = node_1;

        System.out.println("Printing out the List with duplicates: ");

        while (curr != null){

            System.out.print(" " + curr.data);

            curr = curr.next;

        }

        System.out.println();
        curr = node_1;

        deleteDups(curr);

        curr = node_1;
        System.out.println("Printing out the List without duplicates: ");

        while (curr != null){

            System.out.print(" " + curr.data);

            curr = curr.next;

        }



    }

    /*
        This deleteDups method accepts a LinkedListNode parameter and creates a HashSet object and LinkListNode previous
        set to null. Each unique Node data value will be added to the HashSet to be used as a comparison to check if
        the HashSet already contains a match of node data. If a match is found the skip the node, but is the node
        data is unique then add to HashSet and move the node next pointer.
     */
    static void deleteDups(LinkedListNode n){

        HashSet<String> set = new HashSet<String>();
        LinkedListNode previous = null;

        while (n != null){

            if (set.contains(n.data)){
                //if dup node found skip node/next completely
                // previous/next -> node/next -> newnode/next->
                //
                previous.next  = n.next;    //previous/next should point to newnode/next

            } else {
                set.add((String)n.data);
                previous = n;
            }

            n = n.next;


        }





    }


}
