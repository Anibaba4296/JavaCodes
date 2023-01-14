package com.Anibaba;
import java.util.*;
public class PalindromeAndArmstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int revNum = 0, armstr = 0, orgNum = num;
        while(num != 0){
            int rem = num % 10;
            revNum = revNum * 10 + rem;
            armstr = armstr + (rem * rem * rem);
            num = num / 10;
        }
        if(orgNum == revNum){
            System.out.println(orgNum + " it is a palindrome number");
        }else{
            System.out.println(orgNum + " it is not a Palindrome number");
        }

        if(orgNum == armstr){
            System.out.println(orgNum + " it is a Armstrong number");
        }else{
            System.out.println(orgNum + " it is not a Armstrong number");
        }
    }
}
