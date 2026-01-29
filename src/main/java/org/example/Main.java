package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int age = 14;
        double height = 141.1;
        String grade = "A";
        boolean isLearningJava = false;
        System.out.println(age);
        System.out.println(height);
        System.out.println(grade);
        System.out.println("Are you learning java " + isLearningJava);
        double price = 99.99;
        int number = (int) price;
        System.out.println(number);

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int ages = scanner.nextInt();

        System.out.println( "My name is " + name + " and my age is " + ages);
        // float f =100.3;
    }
}