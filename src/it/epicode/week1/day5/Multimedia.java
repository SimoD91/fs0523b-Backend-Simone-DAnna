package it.epicode.week1.day5;

abstract class Multimedia {
    protected String titolo;
    protected int durata;

    public Multimedia(String titolo, int durata){
        this.titolo = titolo;
        this.durata = durata;
    }
}