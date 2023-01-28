package Assignment_3;

//Design a stack that returns the minimum element
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        Stack<Integer> stck = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of enter the elements in the stack : ");
        int n = sc.nextInt();
        System.out.println("Elements : ");
        int minElement = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            stck.push(sc.nextInt());
            minElement = Math.min(minElement,stck.peek());
        }
        System.out.println("Minimum element is : " + minElement);
    }
}
