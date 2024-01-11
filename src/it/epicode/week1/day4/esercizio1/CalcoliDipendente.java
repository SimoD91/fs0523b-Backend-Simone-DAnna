package it.epicode.week1.day4.esercizio1;

public class CalcoliDipendente {
    public static void main(String[] args) {
        Dipendente dipendente = new Dipendente(1000.0,"54544551", 1200.0, 30, Livello.OPERAIO, Dipartimento.PRODUZIONE);

        dipendente.stampaDatiDipendente();
        dipendente.promuovi();
        dipendente.stampaDatiDipendente();
    }
}
