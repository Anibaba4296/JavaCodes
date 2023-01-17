package com.Anibaba;
public class TotalSum {
    public static void main(String[] args) {
        int lb = 1,ub=1000, sum = 0;
        int i=lb;
        while (i <= ub) {
            if((i%3 ==0  || i%5 ==0 || i%7 ==0) && (i%15 !=0  || i%21 !=0 || i%35 !=0 || i%105 !=0) ){
                sum = sum + i;
            }
            //System.out.println(sum);
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
