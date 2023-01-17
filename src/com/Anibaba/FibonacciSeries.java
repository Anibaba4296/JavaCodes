package com.Anibaba;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0, b=1;
        System.out.print(a + " " + b + " ");
        for(int i=1;i<=n;i++){
            int nextval = a+b;
            a = b;
            b = nextval;
            System.out.print(nextval + " ");
        }
    }
}
