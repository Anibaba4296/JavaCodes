package Assignment_4;

import java.util.*;
public class Question2 {

    public static void main(String[] args) {
        LinkedList<Integer> newlist = new LinkedList<>();
        newlist.add(1);
        newlist.add(19);
        newlist.add(12);
        newlist.add(0);
        newlist.add(-1);
        newlist.add(2);
        Collections.sort(newlist);
        System.out.println(newlist);
    }
}
