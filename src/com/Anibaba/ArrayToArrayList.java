package com.Anibaba;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayToArrayList {
    public static void arrayToArrayList(int arr[], int n){
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arrList.add(arr[i]);
        }
        System.out.print("Arraylist : ");
        System.out.println(arrList);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements : ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        arrayToArrayList(arr,n);
    }
}
