package it.epicode.week1.day1;

import java.util.Scanner;

public class PrimaClasse {

    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);
        System.out.println("Dammi un numero");
        int j = scanner.nextInt();
        System.out.println(j);

        scanner.nextLine();

        System.out.println("Dammi una parola");
        String parola = scanner.nextLine();

        System.out.println(parola.length());

        //commento su una riga

        /*
        commento
        su
        più
        righe
         */

        /**
         *
         */

        int x;
        x=8;
        int y = 0;

        final int r = 6;
        boolean t = true;
        char c = '0';
        byte b = 6;
        short s = 9;
        long l = 10000000;
        float f = 3.5f;
        double d = 3.6;
        String frase = "corso Java";
        String frase2 = "Epicode";
        String fraseConcatenata = frase + frase2;
        System.out.println(fraseConcatenata);
        System.out.println("ciao");

        //casting (conversione implicita)
        int z = s;
        float f2 = z;
        System.out.println(z);
        System.out.println(f2);

        //operatori
        z = z%3;
        System.out.println(z);
        z++;
        System.out.println(z);

        //primo metodo dichiarato con traccia sotto al main
        double somma = somma(4,5);
        System.out.println(somma);

        //secondo metodo dichiarato con traccia sotto al main
        benvenuto("Silvia");
        benvenuto("Roberto");
    }

    //metodo (che ritorna un valore)
    public static double somma(double x, double y){
        double somma = x + y;
        return somma;
    }
    //metodo che non ritorna nulla)
    public static void benvenuto(String nome){
        System.out.println("Benvenuto " + nome);
    }
}
