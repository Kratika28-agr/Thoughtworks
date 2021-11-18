package com.prograd;

import java.util.Scanner;

public class FindArrayType {
    public static int checkEvenOddOrMixed(int[] array , int num){
        int totalEven =0;
        int totalOdd=0;
        for(int i=0;i<num;i++){
            if(array[i]%2 != 0)
                totalOdd++;
            else
                totalEven++;
        }
         if(totalEven==num) return 1;
         else if(totalOdd==num) return 2;
         else return 3;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] array=new int[num];

        for(int i=0;i<num;i++){
            array[i]=sc.nextInt();
        }

        if(checkEvenOddOrMixed(array , num)==1)
            System.out.println("Even");
        else if (checkEvenOddOrMixed(array , num)==2)
            System.out.println("Odd");
        else
            System.out.println("Mixed");
    }
}
