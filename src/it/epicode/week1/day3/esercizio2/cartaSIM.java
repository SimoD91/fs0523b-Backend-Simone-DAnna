package it.epicode.week1.day3.esercizio2;

public class cartaSIM{
    private int numero;
    private double costo;
    private double credito;
    private String[] ultimeChiamate;

    public cartaSIM(int numero, double costo, double credito, String[] ultimeChiamate){
        this.numero = numero;
        this.costo = costo;
        this.credito = credito;
        this.ultimeChiamate = new String[5];
    }
    public int getNumero(){
        return numero;
    }
    public double getCosto(){
        return costo;
    }
    public double getCredito(){
        return credito;
    }
    public String[] getUltimeChiamate(){
        return ultimeChiamate;
    }
    public void setCredito(double credito){
        this.credito = credito;
    }
    public void stampaDatiSIM(){
        System.out.println("Numero di telefono: " + numero);
        System.out.println("Costo per secondo: " + costo);
        System.out.println("Credito disponibile: " + credito);
        System.out.println("Ultime 5 chiamate:");
        for (String chiamata:ultimeChiamate) {
            System.out.println(chiamata);
        }
    }
    private void aggiungiChiamata(String chiamata) {
        for (int i = ultimeChiamate.length - 1; i > 0; i--) {
            ultimeChiamate[i] = ultimeChiamate[i - 1];
        }
        ultimeChiamate[0] = chiamata;
    }
    public boolean telefonata(int secondi, String numeroChiamato) {
        double costoChiamata = costo * secondi;

        if (credito >= costoChiamata) {
            credito -= costoChiamata;
            aggiungiChiamata("Durata: " + secondi + " secondi, Numero chiamato: " + numeroChiamato);
            return true;
        } else {
            return false;
        }
    }
}
