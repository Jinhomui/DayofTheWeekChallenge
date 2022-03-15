package com.company;

public class Main {

    public static void main(String[] args) {
        printDayofTheWeek(7);
    }

    public static void printDayofTheWeek(int day){
        if(day<0 || day >6){
            System.out.printf("Invalid day");
        } if(day == 1){
            System.out.printf("Monday");
        } if(day == 2){
            System.out.printf("Tuesday");
        } if(day == 3){
            System.out.printf("Wednesday");
        } if(day == 4){
            System.out.printf("Thursday");
        } if(day == 5){
            System.out.printf("Friday");
        } if(day == 6){
            System.out.printf("Saturday");
        } if(day == 0){
            System.out.printf("Sunday");
        }

    }
}
