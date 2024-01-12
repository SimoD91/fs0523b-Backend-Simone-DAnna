package it.epicode.week1.day5;

public class Video extends Multimedia implements Riproduci {
    private int volume;
    private int luminosita;
    public Video(String titolo, int durata, int luminosita, int volume) {
        super(titolo, durata);
        this.luminosita = luminosita;
        this.volume = volume;
    }
    public void abbassaVolume(int volume) {
        System.out.println(" e abbassa il volume ->");
        if ((this.volume - volume) >= 0) {
            this.volume -= volume;
        } else {
            this.volume = 0;
            System.out.println("Volume al minimo.");
        }
    }
    public void alzaVolume(int volume) {
        System.out.println(" alza il volume ->");
        if ((this.volume + volume) <= 100) {
            this.volume += volume;
        } else {
            this.volume = 100;
            System.out.println("Volume al massimo.");
        }
    }
    public void alzaLuminosita(int luminosita) {
        System.out.print("Alza la luminosità e");
        if ((this.luminosita + luminosita) <= 100) {
            this.luminosita += luminosita;
        } else {
            this.luminosita = 100;
            System.out.println("Luminosità al massimo.");
        }
    }
    public void abbassaLuminosita(int luminosita) {
        System.out.print("Abbassa la luminosità");
        if ((this.luminosita - luminosita) >= 0) {
            this.luminosita -= luminosita;
        } else {
            this.luminosita = 0;
            System.out.println("Luminosità al minimo.");
        }
    }
    @Override
    public void play() {
        for(int i = 0; i < durata; i++){
            System.out.print("Titolo video:" + titolo);{
                System.out.print(" /// Volume: ");
            }
            for (int v = 0; v < volume; v++) {
                System.out.print("!");
            }
            System.out.print(" /// Luminosità: ");
            for (int l = 0; l < luminosita; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}