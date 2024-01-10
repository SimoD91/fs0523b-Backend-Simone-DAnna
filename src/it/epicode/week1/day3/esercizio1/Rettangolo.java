package it.epicode.week1.day3.esercizio1;

public class Rettangolo {
    private int altezza;
    private int larghezza;

    public Rettangolo(int altezza, int larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }
    public int calcolaPerimetro(){
        return 2 * (altezza + larghezza);
    }
    public int calcolaArea(){
        return altezza * larghezza;
    }
    public void stampaRettangolo(){
        int perimetro = calcolaPerimetro();
        int area = calcolaArea();

        System.out.println("Il perimetro del rettangolo è: " + perimetro);
        System.out.println("L'area del rettangolo è: " + area);
    }
    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("Perimetro rettangolo 1: " + rettangolo1.calcolaPerimetro());
        System.out.println("Area rettangolo 1: " + rettangolo1.calcolaArea());
        System.out.println();

        System.out.println("Perimetro rettangolo 2: " + rettangolo2.calcolaPerimetro());
        System.out.println("Area rettangolo 2: " + rettangolo2.calcolaArea());
        System.out.println();

        int perimetri = rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro();
        int aree = rettangolo1.calcolaArea() + rettangolo2.calcolaArea();

        System.out.println("La somma dei perimetri è: " + perimetri);
        System.out.println("La somma delle aree è: " + aree);
    }
}
