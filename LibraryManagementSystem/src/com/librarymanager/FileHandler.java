package com.librarymanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class FileHandler {
	 //  Save books to file
    public static void saveBooksToFile(HashSet<Book> books) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("book.txt"))) {
            for (Book b : books) {
                String line = b.gettitle() + "," + b.getauthor() + "," + b.getisbn();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving books to file: " + e.getMessage());
        }
    }

    //  Load books from file
    public static HashSet<Book> loadBooksFromFile() {
        HashSet<Book> books = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("book.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    books.add(new Book(parts[0], parts[1], parts[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("No existing book file found. Starting with default books.");
        }
        return books;
    }

}
