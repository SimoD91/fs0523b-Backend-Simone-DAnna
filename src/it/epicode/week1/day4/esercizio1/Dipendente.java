package it.epicode.week1.day4.esercizio1;

public class Dipendente {
    private double stipendioBase;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendioBase = 1000;
        this.stipendio = this.stipendioBase;
        this.importoOrarioStraordinario = 30.0;
        this.livello = Livello.OPERAIO;
        this.dipartimento = dipartimento;
    }

    public Dipendente(double stipendioBase, String matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.stipendioBase = stipendioBase;
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void stampaDatiDipendente() {
        System.out.println("Matricola: " + matricola);
        System.out.println("Stipendio Base: " + stipendioBase);
        System.out.println("Stipendio: " + stipendio);
        System.out.println("Importo Orario Straordinario: " + importoOrarioStraordinario);
        System.out.println("Livello: " + livello);
        System.out.println("Dipartimento: " + dipartimento);
    }

    public Livello promuovi() {
        if (Livello.OPERAIO == livello) {
            livello = Livello.IMPIEGATO;
            stipendio *= 1.2;
            System.out.println("Promozione a Impiegato");
        } else if (Livello.IMPIEGATO == livello) {
            livello = Livello.QUADRO;
            stipendio *= 1.5;
            System.out.println("Promozione a Quadro");
        } else if (Livello.QUADRO == livello) {
            livello = Livello.DIRIGENTE;
            stipendio *= 2;
            System.out.println("Promozione a Dirigente");
        }
        return livello;
    }
}


