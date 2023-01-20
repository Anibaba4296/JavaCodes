package com.Anibaba;

import java.util.Scanner;

public class SumUsingRecursion {
    static int sum = 0;
    public static int sumFun(int n){
//        if(n == 0){
//            return 0;
//        }
        if(n>0){
            sum = n + sumFun(n-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumFun(n));
    }
}
