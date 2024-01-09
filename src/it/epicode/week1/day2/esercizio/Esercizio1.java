package it.epicode.week1.day2.esercizio;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli una parola per controllare se il numero di caratteri è pari o dispari");
        String parola = scanner.next();

        stringaPariDispari(parola);

        System.out.println("Inserisci un anno");
        int anno = scanner.nextInt();

        annoBisestile(anno);
    }

    public static boolean stringaPariDispari(String frase) {
        if (frase.length() % 2 == 0) {
            System.out.println("La parola è pari");
            return true;
        } else {
            System.out.println("La parola è dispari");
            return false;
        }
    }

    public static boolean annoBisestile(int anno){
        if(anno%4 == 0 || anno%100 == 0 && anno%400 == 0){
            System.out.println("Anno bisestile");
            return true;
        }else{
            System.out.println("Anno non bisestile");
            return false;
        }
    }
}
