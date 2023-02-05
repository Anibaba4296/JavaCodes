package com.Anibaba;

import java.util.*;
public class TryLinkedList1 {
    public static void main(String[] args){
        // we created a linked list 'newList'
        LinkedList<String> newList = new LinkedList<String>();

        // we add the elements to it
        newList.add("A");
        newList.add("B");
        newList.add("C");
        newList.add("D");
        newList.add("E");
        newList.add("F");

        // addition using index
        newList.add(2,"New element");

        // We will print the list now
        System.out.println(newList);

        // Now we will remove the element
        newList.remove();  // this will remove the first element

        // We will print the list now
        System.out.println(newList);

        // Now we will remove the element
        newList.remove(1);  // this will remove 1st index element

        // We will print the list now
        System.out.println(newList);

        // now we will check the size of the linked list
        System.out.println("Size of the LinkedList : "+newList.size());

        // we can change the  value of the element using set method
        //newList.set(0,"Start element");  // element at 0th index will be replaced with given string

        // print linked list
        //System.out.println(newList);

        // printing the elements using for loop
        for(int i=0;i<newList.size();i++){
            System.out.print(newList.get(i)+" ");
        }
        System.out.println();


    }
}
