package it.epicode.week1.day3.esercizio1;

import static it.epicode.week1.day3.esercizio1.Rettangolo.stampaDueRettangoli;

public class CalcolaRettangolo {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(5,10);
        Rettangolo rettangolo2 = new Rettangolo(2,6);

        stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}
