package com.prograd;

import java.util.Scanner;

public class GenerateCollatzSeq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count = 0;
        while(n != 1){
            System.out.print(n+" ");

            if((n%2) == 0){
                n = n/2;
            }

            else{
                n = 3*n+1;
            }
            count++;
        }
        System.out.print(n+" "+count);
    }
}
