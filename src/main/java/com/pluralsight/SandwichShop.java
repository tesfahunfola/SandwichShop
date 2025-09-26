package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
//Step 1
//Prompt the user for the size of the sandwich (1 or 2):
//a. 1: Regular: base price $5.45
//b. 2: Large: base price $8.95
//Prompt the user for their age:
//a. Student (17 years old or younger) — receive a 10% discount
//b. Seniors (65 years old or older) — receive a 20% discount
//Display the cost of the sandwich to the screen
//Step 2
//1. Ensure all your changes are committed and pushed to GitHub
//2. Send your repository URL to your Instructor

        Scanner scanner = new Scanner(System.in);

        System.out.println("Size of your sancwich: \n  1. Regular: base price $5.45 \n  2. Large: base price $8.95");
        int command = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Would like the sandwich 'loaded' (yes/no)? ");
        String loaded = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();


        double totalPrice = 0;

        if (command == 1){
            totalPrice = 5.45;

        }
        else if(command == 2){
           totalPrice = 8.95;

        }else {
            System.out.println("Invalid input");
        }
        if (command == 1 && loaded.equalsIgnoreCase("yes")){
            totalPrice += 1;
        }else if(command == 2 && loaded.equalsIgnoreCase("no")){
            totalPrice += 1.75;
        }

        if(age<18){
            totalPrice = totalPrice * 0.9;
        }else if(age >65){
            totalPrice = totalPrice * 0.8;
        }
        System.out.printf("The Total price is: %.2f ", totalPrice);
    }
}
