package it.epicode.week2.day2.esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");

        int N = scanner.nextInt();
        scanner.nextLine();

        Set<String> parole = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Inserisci una parola");
            String parola = scanner.nextLine();
            if (!parole.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("Parole duplicate: " + paroleDuplicate);
        System.out.println("Parole distinte (numero): " + parole.size());
        System.out.println("Parole distinte (elenco): " + parole);
    }
}
