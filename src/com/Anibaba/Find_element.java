package com.Anibaba;

public class Find_element {
    public static void main(String[] args){
        int[] arr = {1,2,4,3,5,6,7};
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == i){
                System.out.println(i);
                break;
            }
        }
    }
}
