package com.Anibaba;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n > 0){
            System.out.println(n + " is Positive Number");
        }else if(n < 0){
            System.out.println(n + " is Negative Number");
        }else{
            System.out.println(n + " is Zero");
        }
    }
}
