package com.Anibaba;
import java.util.*;
public class ReveseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(5);
        arrList.add(7);
        arrList.add(4);
        arrList.add(12);
        arrList.add(11);
        arrList.add(3);
        arrList.add(9);
        System.out.println("Actual arrayList");
        System.out.println(arrList);
        Collections.reverse(arrList);
        System.out.println("Reversed arrayList");
        System.out.println(arrList);
        Collections.sort(arrList);
        System.out.println("Sorted arrayList");
        System.out.println(arrList);
        arrList.remove(4);  // this will remove the element at index 4
        System.out.println("ArrayList after removing 4th index element");
        System.out.println(arrList);
    }
}
