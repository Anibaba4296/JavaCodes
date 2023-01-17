package com.Anibaba;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                if(c ==1 || c == r){
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 3 ");
                }
            }
            System.out.println();
        }
    }
}
