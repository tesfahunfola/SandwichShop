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
        String command = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (command.equals("1")){
            if (age <= 17){
                System.out.println("Regular: base price $4.905 ");
            }else if(age >= 65){
                System.out.println("Regular: base price $4.36");
            }else {
                System.out.println("Regular: base price $5.45");
            }

        }
        else if(command.equals("2")){
            if (age <= 17){
                System.out.println("Regular: base price $8.055 ");
            }else if(age >= 65){
                System.out.println("Regular: base price $7.16");
            }else {
                System.out.println("Large: base price $8.95");
            }
        }else {
            System.out.println("Invalid input");
        }


    }
}
