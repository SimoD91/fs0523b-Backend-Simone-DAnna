package it.epicode.week2.day3.esercizio1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //dichiaro la lista di prodotti
        List<Product> prodotti = new ArrayList<>();
        prodotti.add(new Product(1L, "Il piccolo principe", "Books", 120.0));
        prodotti.add(new Product(2L, "Il signore delle mosche", "Books", 150.0));
        prodotti.add(new Product(2L, "Dieci piccoli indiani", "Books", 20.0));
        prodotti.add(new Product(3L, "Ciuccio", "Baby", 10.0));
        prodotti.add(new Product(4L, "Pistola giocattolo", "Boys", 50.0));

        /* converto la lista in stream per utilizzare i lambda streams, utilizzo filter per filtrarla e
           inserisco gli elementi filtrati in una nuova lista usando collect
        */
        List<Product> prodottiFiltrati = prodotti.stream().filter(product ->
                "Books".equals(product.getCategory()) && product.getPrice() > 100)
                .collect(Collectors.toList());


        System.out.println("Prodotti categoria Books con prezzo superiore a 100€:");
        //uso foreach per stampare ogni elemento della lista filtrata nel terminale
        prodottiFiltrati.forEach(prodotto -> System.out.println(prodotto));
    }
}
