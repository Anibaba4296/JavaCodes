package Assignment_5;

import java.util.LinkedList;

public class Question_4 {
    public static void main(String[] args) {
        LinkedList<Integer> newList = new LinkedList<Integer>();
        newList.add(8);
        newList.add(2);
        newList.add(3);
        newList.add(1);
        newList.add(7);
        System.out.println(newList);
        newList.remove(1);
        System.out.println(newList);
    }
}
