package com.Anibaba;

import java.util.Scanner;

public class PowerOf2 {
    static int count = 0;
    public static int powerOf2(int n){
        if(n > 0){
            if((n & 1) != 1){
                count++;
            }
            powerOf2(n>>1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(powerOf2(n));
    }
}
