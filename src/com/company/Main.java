package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //task4
        //increment and decrement
        int value1 = 5;
        ++value1;
        System.out.println("result of value after increment:" + value1);
        System.out.println("result of value after decrement: " + --value1);

        //Bitwise Complement Operator
        System.out.println("Bitwise complement of " + value1 + " : " + ~value1);

        //Arithmetic operator
        System.out.println("Arithmetic operation multiplication:" + ~value1 * 2);

        //Relational Operator
        int value2 = 3;
        System.out.println(value1 > value2); //true

        //Bitwise operator
        System.out.println(value1 | value2);

        //Conditional Operator
        String out;
        out = value1==value2 ? "Yes":"No";
        System.out.println("Answer: "+ out);

        task5();
    }

   static void task5() {

      //task 5
        //Input distance in meters: 2500
        //Input hour: 5
        //Input minutes: 56
        //Input seconds: 23
        //Expected Output :
        //Your speed in meters/second is 0.11691531
        //Your speed in km/h is 0.42089513
        //Your speed in miles/h is 0.26158804

       Scanner scanner = new Scanner(System.in);
       float time_in_seconds;
       float value1, value2, value3;


       System.out.println("input distance in meters:");
       float distance = scanner.nextFloat();

       System.out.print("Input hour: ");
       float hr = scanner.nextFloat();

       System.out.print("Input minutes: ");
       float min = scanner.nextFloat();

       System.out.print("Input seconds: ");
       float sec = scanner.nextFloat();

       float timeSeconds = (5 * 3600) + (56 * 60) + 23;

       value1 = distance / timeSeconds;
       value2 = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
       value3 = value2 / 1.609f;

       System.out.println("speed in m/sec is "+ value1);
       System.out.println("speed in km/h is "+ value2);
       System.out.println("speed in miles/h is "+ value3);

       scanner.close();

   }
}

