package com.Anibaba;
import java.util.Scanner;
public class Voting_system {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int age = sc.nextInt();
        if(ch == 'M' || ch == 'm'){
            if(age>=21){
                System.out.println("He can Vote");
            }else{
                System.out.println("He can't Vote");
            }
        }else if(ch == 'F' || ch == 'f'){
            if(age>=18){
                System.out.println("She can Vote");
            }else{
                System.out.println("She can't Vote");
            }
        }else{
            System.out.println("Invalid Input");
        }
    }
}
