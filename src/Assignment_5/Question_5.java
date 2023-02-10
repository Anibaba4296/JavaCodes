package Assignment_5;

import java.util.LinkedList;

public class Question_5 {
    public static void main(String[] args) {
        LinkedList<Integer> newList = new LinkedList<Integer>();
        newList.add(10);
        newList.add(20);
        newList.add(30);
        newList.add(12);
        newList.add(0);
        newList.add(23);
        newList.add(2);
        newList.add(12);
        System.out.println(newList);
        int element = 23,ans=-1;
        int n = newList.size();
        for(int i=0;i<n;i++){
            if(newList.get(i) == element){
                ans=i;
                break;
            }
        }
        System.out.println("Element present at : "+ans+"th index");
    }
}
