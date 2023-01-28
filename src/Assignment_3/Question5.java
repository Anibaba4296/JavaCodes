package Assignment_3;

//Reverse a stack using recursion

import java.util.*;
public class Question5 {
    static Stack<Character> stck = new Stack<>();
    private static void inser_at_bottom(char x) {
        if (stck.isEmpty())
            stck.push(x);
        else {
            char a = stck.peek();
            stck.pop();
            inser_at_bottom(x);

            stck.push(a);
        }
    }
    static void reverse() {
        if(!stck.isEmpty()){
            char x = stck.peek();
            stck.pop();
            reverse();
            inser_at_bottom(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("No. of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the stack : ");
        for(int i=0;i<n;i++){
            stck.push(sc.next().charAt(0));
        }
        System.out.println("Original stack : "+stck);
        reverse();
        System.out.println("Reversed stack : " + stck);

    }
}
