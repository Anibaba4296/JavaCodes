package Assignment_4;

//Find the middle element in Linked List
//if the given linked list is 1->2->3->4->5->6 then the output should be 4

import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        LinkedList<Integer> newList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the list is : " + newList.size());
        System.out.println("Enter the number of elements you want to enter : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            newList.add(sc.nextInt());
        }
        int midElement = newList.get(newList.size()/2);
        System.out.println("List is : "+newList);
        System.out.println("Middle most element is : " + midElement);
    }
}
