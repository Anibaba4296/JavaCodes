package com.Anibaba;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        double ans=0;
        while(n != 0){
            int bit = n & 1;
            ans = ans + (bit * Math.pow(2,i));
            i++;
            n = n/10;
        }
        System.out.println(ans);
    }
}
