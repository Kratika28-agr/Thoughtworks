package com.tw.prograd;

import java.util.Scanner;

public class WeeklySalary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sun = sc.nextInt();
        int mon = sc.nextInt();
        int tue = sc.nextInt();
        int wed = sc.nextInt();
        int thu = sc.nextInt();
        int fri = sc.nextInt();
        int sat = sc.nextInt();

        int sunSal,monSal,tueSal,wedSal,thuSal,friSal,satSal,bonus = 0;



        //Monday
        if(mon <= 8){
            monSal = mon*100;
        }
        else{
            monSal = (mon-8)*115+800;

        }
        //Tuesday
        if(tue <= 8){
            tueSal = tue*100;
        }
        else{
            tueSal = (tue-8)*115+800;
        }
        //Wednesday
        if(wed <= 8){
            wedSal = wed*100;
        }
        else{
            wedSal = (wed-8)*115+800;
        }
        //Thursday
        if(thu <= 8){
            thuSal = thu*100;
        }
        else{
            thuSal = (thu-8)*115+800;
        }
        //Friday
        if(fri <= 8){
            friSal = fri*100;
        }
        else{
            friSal = (fri-8)*115+800;
        }

        satSal = sat*125;

        sunSal = sun*150;

        int totalHours = mon+tue+wed+thu+fri;
        if(totalHours > 40){
            totalHours -= 40;
            bonus = totalHours*25;
        }

        int totalSalary = sunSal+monSal+tueSal+wedSal+thuSal+friSal+satSal+bonus;
        System.out.println(totalSalary);
    }
}
