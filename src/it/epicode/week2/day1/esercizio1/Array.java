package it.epicode.week2.day1.esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;

public class Array {
    private int[] array;
    private static Logger logger = (Logger) LoggerFactory.getLogger(Array.class);

    public Array() {
        array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
    }
    public void stampaArray() {
        System.out.print("Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public void aggiornaArray(int position, int number) {
        if (position >= 0 && position < array.length) {
            array[position] = number;
            System.out.println("Array aggiornato");
        } else {
            String errorMessage = "Posizione non presente, superati i limiti dell'array";
            System.out.println(errorMessage);
            logger.error(errorMessage);
        }
    }
}
