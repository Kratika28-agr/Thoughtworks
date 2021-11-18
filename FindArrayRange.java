package com.prograd;

import java.util.Arrays;
import java.util.Scanner;

public class FindArrayRange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];

        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
         int maximumNo=array[n-1];
         int minimumNo=array[0];

         int difference=maximumNo - minimumNo;
         System.out.println(difference);
    }
}
