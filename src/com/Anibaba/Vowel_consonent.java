package com.Anibaba;
import java.util.Scanner;
public class Vowel_consonent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonent");
        }
    }
}