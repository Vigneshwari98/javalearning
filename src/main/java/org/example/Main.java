package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // int age = 14;
        // double height = 141.1;
        // String grade = "A";
        // boolean isLearningJava = false;
        // System.out.println(age);
        // System.out.println(height);
        // System.out.println(grade);
        // System.out.println("Are you learning java " + isLearningJava);
        // double price = 99.99;
        // int number = (int) price;
        // System.out.println(number);
        //
        // int a = 20;
        // int b = 2;
        // System.out.println(a+b);
        // System.out.println(a-b);
        // System.out.println(a*b);
        // System.out.println(a/b);
        // System.out.println(a%b);

        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        if(numbers > 0){
            System.out.println("this is a positive no");
        }
        else if(numbers < 0){-
            System.out.println("this is a negative no");

        }
        else{
            System.out.println("this is zero");
        }
        //
        // int no = scanner.nextInt();
        // if (no%2 == 0){
        //     System.out.println("this is a even no");
        // }
        // else if (no%2 != 0){
        //     System.out.println("this is an odd no");
        // }
        // else{
        //     System.out.println("Number45");
        //
        // }
        // //
        //
        // String name = scanner.nextLine();
        // int ages = scanner.nextInt();
        //
        // System.out.println( "My name is " + name + " and my age is " + ages);
        // float f =100.3;




    }
}