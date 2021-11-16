package com.tw.prograd;

import java.util.*;

public class FindMangoTrees {
     public static boolean checkTreeIsMangoOrNot(int rows,int cols,int treeNum){
         if(treeNum >= 1 && treeNum <= cols){
             return true;
         }
         for(int i=0;i<rows;i++){
             if(treeNum == cols*2 || treeNum == ((cols*2)+1))
                 return true;
         }
         return false;
     }
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int treeNum = sc.nextInt();
   if(!checkTreeIsMangoOrNot(rows,cols,treeNum)){
       System.out.println("no");
   }
   else{
       System.out.println("yes");
   }

    }
}
