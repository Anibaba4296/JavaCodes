package com.Anibaba;



/*
* queue follow first in first out concept
* front = -1 , rear = -1
* two methods ==> 1. enqueue    2. dequeue
*
*/
public class QueueImplementation {
    int front=-1,rear=-1,maxLimit=1000;

    int[] arr = new int[maxLimit];

    // isEmpty()
    public void isEmpty(){
        if(rear == -1){
            System.out.println("Queue is empty");
        }
    }

    // size()
    public int size(){
        int value=0;
        if(front == rear){
            return 0;
        }else{
            for(int i=front;i<=rear;i++){
                value++;
            }
            return value;
        }

    }

    //display()
    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // enQueue()
    public void enQueue(int data){
        if(rear == maxLimit-1){
            System.out.println("Queue is full");
            return;
        }else{
            front=0;
            rear++;
            arr[rear] = data;
        }
    }

    // deQueue
    public void deQueue(){
        if(front > rear){
            System.out.println("Queue has no more element");
            return ;
        }else{
            front++;
        }
    }

    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation();

        // check if Queue is empty
        queue.isEmpty();
        // check the size of the queue
        System.out.println("Initial size of the queue is : " + queue.size());

        // we will write the data in the queue
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);

        //check the size of the queue
        System.out.println("Size after enQueue in the queue is : " + queue.size());

        //display
        System.out.print("Queue : ");
        queue.display();
        System.out.println();

        // deQueue elements
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue(); // this line will print that there is no more element in the queue
        System.out.print("Queue after deletion : ");
        queue.display();

    }
}
