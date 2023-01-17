package com.Anibaba;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans[] = new int[100];
        int i=0;
        while(n != 0){
            int bit = n & 1;
            ans[i] = bit;
            n = n >> 1;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(ans[j]);
        }
    }
}
