package it.epicode.week1.day2.esercizio;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrivi un numero intero:");

        int number = scanner.nextInt();

        progSwitch(number);
    }

    public static void progSwitch(int number) {
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore");
        }
    }
}
