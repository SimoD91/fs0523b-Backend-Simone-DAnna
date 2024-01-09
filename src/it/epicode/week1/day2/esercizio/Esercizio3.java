package it.epicode.week1.day2.esercizio;

import java.util.Arrays;
import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrivi una stringa:");
        String stringa = scanner.nextLine();

        progWhile(stringa);
    }

    public static void progWhile(String stringa) {
        String[] risultato = stringa.split("");

        System.out.println("Risultato della suddivisione:");

        int i = 0;
        while (i <= 0) {
            System.out.println(Arrays.toString(risultato));
            i++;
        }
    }
}