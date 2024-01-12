package it.epicode.week1.day5;

public class RegistrazioneAudio extends Multimedia implements Riproduci{
    private int volume;
    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }
    public void abbassaVolume(int volume){
        System.out.println("Abbassa il volume ->");
        if((this.volume - volume) >= 0){
            this.volume -= volume;
        }else{
            this.volume = 0;
            System.out.println("Volume al minimo.");
        }
    }
    public void alzaVolume(int volume){
        System.out.println("Alza il volume ->");
        if((this.volume + volume) <= 100){
            this.volume += volume;
        }else{
            this.volume = 100;
            System.out.println("Volume al massimo.");
        }
    }
    @Override
    public void play() {
        for(int i = 0; i < durata; i++){
            System.out.print("Titolo audio:" + titolo);{
                System.out.print(" /// Volume: ");
            }
            for (int v = 0; v < volume; v++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }
}