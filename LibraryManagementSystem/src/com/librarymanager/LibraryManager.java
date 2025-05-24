package com.librarymanager;

import java.util.*;

public class LibraryManager {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        HashSet<Book> books = FileHandler.loadBooksFromFile(); // Load from file

        System.out.println("\t\t\tWelcome to Library manager");
        System.out.println("\t\t******************************************");

        boolean flag = true;

        while (flag) {
            System.out.println("\nSelect your option");
            System.out.println(" 1. Add a book");
            System.out.println(" 2. Remove a book");
            System.out.println(" 3. Search a book");
            System.out.println(" 4. View all books");
            System.out.println(" 5. Exit");

            int user_selection = sc.nextInt();

            switch (user_selection) {

                case 1:
                    sc.nextLine();
                    System.out.print("Enter title of the book: ");
                    String title_new = sc.nextLine();
                    System.out.print("Enter author of the book: ");
                    String author_new = sc.nextLine();
                    System.out.print("Enter isbn of the book: ");
                    String isbn_new = sc.nextLine();

                    Book book_obj = new Book(title_new, author_new, isbn_new);
                    books.add(book_obj);
                    System.out.println("Adding....................");
                    Thread.sleep(1000);
                    System.out.println("Book added successfully!!!");

                    FileHandler.saveBooksToFile(books); // Save after adding
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter the book title to remove: ");
                    String remove_book = sc.nextLine();

                    Iterator<Book> it1 = books.iterator();
                    boolean removed = false;
                    while (it1.hasNext()) {
                        Book b = it1.next();
                        if (b.gettitle().equalsIgnoreCase(remove_book)) {
                            it1.remove();
                            System.out.println("Removing....................");
                            Thread.sleep(1000);
                            System.out.println("Book removed successfully!!!");
                            removed = true;
                        }
                    }

                    if (!removed) {
                        System.out.println("Book not found!");
                    } else {
                        FileHandler.saveBooksToFile(books); //  Save after removal
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter the book title to search: ");
                    String view_book = sc.nextLine();

                    boolean found = false;
                    for (Book b : books) {
                        if (b.gettitle().equalsIgnoreCase(view_book)) {
                            b.displaybook_details();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found!");
                    }
                    break;

                case 4:
                    System.out.println("\t\t\tDisplaying all books");
                    for (Book b : books) {
                        b.displaybook_details();
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Library Manager!!!");
                    FileHandler.saveBooksToFile(books); //  Final save before exit
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

   
}
