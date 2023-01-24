package com.Anibaba;
import java.util.*;

public class PrintElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(12);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(56);
        // we will use for loop to printing
        System.out.print("Method 1 : ");
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        System.out.print("Method 2 : ");
        System.out.println(arrayList);
    }
}
