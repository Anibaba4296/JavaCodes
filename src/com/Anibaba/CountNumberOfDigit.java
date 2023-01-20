package com.Anibaba;

import java.util.Scanner;

public class CountNumberOfDigit {
    static int count = 0;
    public static int countDigit(int n){

        if(n>0){
            count++;
            countDigit(n/10);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Number of terms in the digit are : ");
        int ans = countDigit(n);
        System.out.println(ans);
    }
}
