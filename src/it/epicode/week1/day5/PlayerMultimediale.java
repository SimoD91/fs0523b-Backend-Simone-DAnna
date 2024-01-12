package it.epicode.week1.day5;

public class PlayerMultimediale {
    public static void main(String[] args) {
        RegistrazioneAudio audio = new RegistrazioneAudio("`Linkin Park-In The End`",3,10);
        Video video = new Video ("`Rick Roll`",3, 30, 20);
        Immagine immagine = new Immagine ("`Landscape`",2, 4);

        //Player audio
        audio.play();
        audio.abbassaVolume(5);
        audio.play();

        audio.alzaVolume(25);
        audio.play();

        System.out.println();

        //Player video
        video.play();
        video.abbassaLuminosita(15);
        video.abbassaVolume(5);
        video.play();

        video.alzaLuminosita(25);
        video.alzaVolume(25);
        video.play();

        System.out.println();

        //Player immagine
        immagine.show();
        immagine.abbassaLuminosita(2);
        immagine.show();

        immagine.alzaLuminosita(25);
        immagine.show();
    }
}