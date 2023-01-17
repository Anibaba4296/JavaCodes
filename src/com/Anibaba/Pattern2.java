package com.Anibaba;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int r=0;r<n;r++){
            for(int c=n;c>r; c--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
