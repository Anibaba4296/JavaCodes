package com.Anibaba;

import java.util.Scanner;

public class StackImplement {
    int max=1000,top=-1;
    int[] arr = new int[max];

// push method
    public void push(int data){
        if(top > max){
            System.out.println("Stack overflow");
            return;  // this act as break
        }else{
            this.top++;
            arr[top] = data;
        }
    }

// pop method
    public int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }else{
            int removedElement = arr[top];
//        arr[top] = 0;  we will not
            this.top--;
            return removedElement;
        }
    }

// peak method
    public int peak(){
        if(top != -1){
            return arr[top];
        }else{
            return -1;
        }
    }

// display method
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

// size method
    public int size(){
        int size=0;
        for(int i=0;i<=top;i++){
            size++;
        }
        // or we can simply return top+1;
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // we create constructor and object to create array outside main
        StackImplement stack = new StackImplement();
        // array is empty here
        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println("Top most element " + stack.peak());
        System.out.println("size : " + stack.size());

    }
}
