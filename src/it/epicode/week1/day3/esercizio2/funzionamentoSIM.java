package it.epicode.week1.day3.esercizio2;

public class funzionamentoSIM {
    public static void main(String[] args) {
        cartaSIM sim = new cartaSIM(348217457, 0.2, 20.0, new String[0]);

        sim.stampaDatiSIM();

        boolean chiamata1 = sim.telefonata(40, "342784580");
        boolean chiamata2 = sim.telefonata(30, "345879878");
        boolean chiamata3 = sim.telefonata(50, "342784580");
        boolean chiamata4 = sim.telefonata(20, "345879878");
        boolean chiamata5 = sim.telefonata(100, "342784580");

        System.out.println("Chiamata 1: " + (chiamata1 ? "Effettuata con successo" : "Credito insufficiente"));
        System.out.println("Chiamata 2: " + (chiamata2 ? "Effettuata con successo" : "Credito insufficiente"));
        System.out.println("Chiamata 3: " + (chiamata3 ? "Effettuata con successo" : "Credito insufficiente"));
        System.out.println("Chiamata 4: " + (chiamata4 ? "Effettuata con successo" : "Credito insufficiente"));
        System.out.println("Chiamata 5: " + (chiamata5 ? "Effettuata con successo" : "Credito insufficiente"));

    }
}
