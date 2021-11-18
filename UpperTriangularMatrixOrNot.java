package com.prograd;

import java.util.Scanner;

public class UpperTriangularMatrixOrNot {
    public static boolean isMatrixUpperTriangular(int[][] matrix , int num) {
        int row, col;
        for (row = 0; row < num; row++) {
            for (col = 0; col > row; col++) {
                if (matrix[row][col] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[][] matrix=new int[num][num];

        for(int i=0;i<num;i++) {
            for (int j = 0; j < num; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        if(isMatrixUpperTriangular(matrix , num))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
