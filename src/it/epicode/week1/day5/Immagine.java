package it.epicode.week1.day5;

public class Immagine extends Multimedia implements Show{
    private int luminosita;
    public Immagine(String titolo, int durata, int luminosita) {
        super(titolo, durata);
        this.luminosita = luminosita;
    }
    public void alzaLuminosita(int luminosita) {
        System.out.println("Alza la luminosità ->");
        if ((this.luminosita + luminosita) <= 100) {
            this.luminosita += luminosita;
        } else {
            this.luminosita = 100;
            System.out.println("Luminosità al massimo.");
        }
    }
    public void abbassaLuminosita(int luminosita) {
        System.out.println("Abbassa la luminosità ->");
        if ((this.luminosita - luminosita) >= 0) {
            this.luminosita -= luminosita;
        } else {
            this.luminosita = 0;
            System.out.println("Luminosità al minimo.");
        }
    }
    @Override
    public void show() {
        for(int i = 0; i < durata; i++){
            System.out.print("Titolo immagine:" + titolo);{
            }

            System.out.print(" /// Luminosità: ");
            for (int l = 0; l < luminosita; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}