package Assignment_5;

import java.util.LinkedList;

public class Question_3 {
    public static void main(String[] args) {
        LinkedList<Integer> newList = new LinkedList<Integer>();
        newList.add(3);
        newList.add(5);
        newList.add(8);
        newList.add(10);
        System.out.println(newList);
        newList.add(1,2);
        System.out.println(newList);
    }
}
