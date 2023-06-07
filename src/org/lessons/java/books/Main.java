package org.lessons.java.books;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Benvenuto nel gestionale della biblioteca civica");
        // chiedo all'utente quanti libri vuole catalogare
        System.out.print("Quanti libri vuoi catalogare? ");
        int nBooks = Integer.parseInt(scan.nextLine());

        Book[] books = new Book[nBooks];
        // aggiungo libri in array books
        for (int i = 0; i < nBooks; i++) {
            Book book = null;
            boolean validBook = false;
            do {
                try {
                    System.out.println("Inserisci i dati del libro n° " + (i + 1));
                    // chiedo titolo
                    System.out.print("Titolo: ");
                    String title = scan.nextLine();
                    // chiedo pagine
                    int pages = 0;
                    try {
                        System.out.print("Numero di pagine: ");
                        pages = Integer.parseInt(scan.nextLine());
                    } catch (NumberFormatException e) {
                        // catch senza istruzioni solamente in casi eccezionali e controllati
                    }
                    // chiedo autore
                    System.out.print("Autore: ");
                    String author = scan.nextLine();
                    // chiedo editore
                    System.out.print("Editore: ");
                    String publisher = scan.nextLine();

                    // nuova istanza del libro se rispetta le condizioni imposte
                    book = new Book(title, pages, author, publisher);
                    validBook = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } while (!validBook);

            // aggiungo i libri nell'array
            books[i] = book;
        }

        // stampo contenuto array
        System.out.println(Arrays.toString(books));
        scan.close();
    }
}
