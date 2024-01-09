package it.epicode.week1.day2.esercizio;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrivi un numero da cui far partire il countdown:");
        int number = scanner.nextInt();

    countdown(number);
    }

    public static void countdown(int number){
        for(int i=number; i >= 0; i--){
            System.out.println(i);
        }
    }
}
