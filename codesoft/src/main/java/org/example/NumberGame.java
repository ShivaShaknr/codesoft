package org.example;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = r.nextInt(100);
        int i=0;
        int score=100;
        System.out.println("Welcome to the game ! You have only 25 chances");
        while(i!=25) {
            System.out.print("Please enter your guess: ");
            int user_input = sc.nextInt();
            if (user_input == n) {
                System.out.println("Congrats! You guessed it right");
                break;
            }
            else if(user_input>n){
                System.out.println("Clue : You had guessed it right but little larger");
                System.out.println("Soo close ! Please don't give up");
            }
            else if(user_input<n){
                System.out.println("Clue : You had guessed it right but liitle smaller");
                System.out.println("Soo close ! Please don't give up");
            }
            i++;
            score--;
        }
        System.out.println();
        System.out.println("And finally ! This is your score : "+score+"/100");
    }
}
