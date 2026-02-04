package org.example;

import java.util.Arrays;
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
        //
        //  Scanner scanner = new Scanner(System.in);
        // int numbers = scanner.nextInt();
        // if(numbers > 0){
        //     System.out.println("this is a positive no");
        // }
        // else if(numbers < 0){
        //     System.out.println("this is a negative no");
        //
        // }
        // else{
        //     System.out.println("this is zero");
        // }
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


        // ControlFlow controlFlow = new ControlFlow();

        //
        // for (int v = 1; v <= 10; v++){
        //     System.out.println(v);
        // }
        //
        // int z = 1;
        // while(z<=10){
        //     System.out.println(z);
        //     z++;
        // }


        // Scanner scanner = new Scanner(System.in);
        // int number = scanner.nextInt();
        // for(int i =1;i<=10;i++){
        //     // int result = number;
        //     System.out.println(number +"*"+ i+"=" + (number*i));
        // }

        int[] numbers = {14,12,19,34,83,96};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
            System.out.println("The Largest Number is "+ max);

        // for(value: numbers){
        //     System.out.println(value);
        // }



        // int total = 0;
        // for(int sum : numbers){
        //     total =  total+sum;
        // }
        // System.out.println("Sum = "+ total);

        // System.out.println(Arrays.toString(numbers));


        // for (int number : numbers){
        //     System.out.println(number);
        // }




    }
}