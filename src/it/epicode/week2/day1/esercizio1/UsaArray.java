package it.epicode.week2.day1.esercizio1;

import java.util.Scanner;

public class UsaArray {
    public static void main(String[] args) {
        Array array = new Array();
        while (true) {
            array.stampaArray();

            System.out.println("Inserisci un numero:");
            int inputNumber = new Scanner(System.in).nextInt();

            if (inputNumber == 0) {
                System.out.println("Operazione terminata");
                break;
            }
            System.out.println("Inserisci una posizione da 0 a 4:");
            int position = new Scanner(System.in).nextInt();

            array.aggiornaArray(position, inputNumber);
        }
    }
}
