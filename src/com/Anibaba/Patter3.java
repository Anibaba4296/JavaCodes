package com.Anibaba;

import java.util.Scanner;

public class Patter3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = (n/2)+1;
        for(int r=1;r<=n2;r++){
            for(int c=1;c<=r;c++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int r=n2+1;r<=n;r++){
            for(int c=n;c>=r;c--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
/*
    *
    * *
    * * *
    * * * *
    * * *
    * *
    *
*/
