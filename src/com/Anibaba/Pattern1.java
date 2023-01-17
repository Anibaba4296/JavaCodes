package com.Anibaba;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
