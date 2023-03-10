package Assignment_3;

//Implement a Stack using queue Data Structure
import java.util.*;
public class Question7 {
    Queue queue = new LinkedList();
    public void push(int value) {
        int queueSize = queue.size();
        queue.add(value);
        for (int i = 0; i < queueSize; i++) {
            queue.add(queue.remove());
        }
    }
    public void pop() {
        System.out.println("An element removed from a stack is: " + queue.remove());
    }
    public static void main(String[] args) {
        Question7 test = new Question7();
        test.push(10);
        test.push(20);
        test.push(30);
        test.push(40);
        System.out.println(test.queue);
        test.pop();
        System.out.println(test.queue);
    }
}
