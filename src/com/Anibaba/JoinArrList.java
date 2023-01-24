package com.Anibaba;
import java.util.*;
public class JoinArrList {
    public static void main(String[] args) {
        ArrayList<Integer> arrList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrList2 = new ArrayList<Integer>();
        ArrayList<Integer> arrList3 = new ArrayList<Integer>();
        arrList1.add(1);
        arrList1.add(2);
        arrList1.add(3);
        arrList1.add(4);
        arrList1.add(5);
        arrList2.add(6);
        arrList2.add(7);
        arrList2.add(8);
        arrList2.add(9);
        arrList2.add(10);
        System.out.print("ArrayList 1 : ");
        System.out.println(arrList1);
        System.out.print("ArrayList 2 : ");
        System.out.println(arrList2);
        arrList3.addAll(arrList1);
        arrList3.addAll(arrList2);
        System.out.print("ArrayList 3 : ");
        System.out.println(arrList3);
    }
}
