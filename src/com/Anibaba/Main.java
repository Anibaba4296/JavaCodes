package com.Anibaba;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int res = sum - ((n)*(n+1)/2);
        System.out.println(res);
    }
}
