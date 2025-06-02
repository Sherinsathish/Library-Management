# Library-Management
This is a simple console-based Library Management System developed in Java. It allows a user to add, remove, search, and view books in a library. The books are stored in a HashSet to avoid duplicates and are persisted in a text file (book.txt) using file handling.

📚 Library Management System – Java Console App

This is a simple Java console-based Library Management System. It allows users to manage a collection of books by providing functionality such as adding, removing, searching, and viewing books. The application uses a HashSet to store books, ensures no duplicates, and reads/writes book data to a file (`book.txt`) so that data persists between sessions.

---

🔧 Features

- ✅ Add new books with title, author, and ISBN
- 🗑️ Remove a book by title
- 🔍 Search for a book by title
- 📖 View all books in the library
- 💾 Save books to `book.txt` file and load them back on restart
- 🚫 Prevents duplicate book entries using HashSet
- 🧵 Console-based menu with simple navigation

---

📂 File Structure

LibraryManager/
├── Book.java               # Class defining the Book object  
├── LibraryManager.java     # Main application logic and menu  
├── FileManager.java        # Contains save and load methods  
├── book.txt                # File to store book data (created automatically)  
└── README.md               # Project documentation (this file)

---

📦 Technologies Used

- Java Core  
- HashSet from Java Collections  
- File I/O using BufferedReader and BufferedWriter  
- Exception Handling  
- Scanner for user input  

---

🚀 How to Run the Project

1. Open a terminal/command prompt.
2. Compile all files:
   javac Book.java FileManager.java LibraryManager.java
3. Run the main class:
   java com.librarymanager.LibraryManager

(Note: Ensure the file paths and package names match or adjust accordingly.)

---

📘 Sample book.txt contents

The Alchemist,Paulo Coelho,9780061122415  
1984,George Orwell,9780451524935  
Pride and Prejudice,Jane Austen,9780141439518  
The Hobbit,J.R.R. Tolkien,9780547928227  
To Kill a Mockingbird,Harper Lee,9780060935467  

---

📄 Description of Main Components

1. **Book.java**  
   - Defines a Book with title, author, and ISBN.  
   - Overrides `equals` and `hashCode` for proper comparison in HashSet.  
   - Includes a method to display book details.

2. **FileManager.java**  
   - Has methods:
     - `saveBooksToFile(HashSet<Book>)`: writes all book details to `book.txt`.
     - `loadBooksFromFile()`: reads from `book.txt` and returns a HashSet of books.

3. **LibraryManager.java**  
   - Main program with a user-friendly console menu.
   - Supports options:
     1. Add a book
     2. Remove a book
     3. Search a book
     4. View all books
     5. Exit
   - Uses `Thread.sleep()` to simulate processing delay.

---

✅ Best Use Case

This project is ideal for:
- Beginners learning Java OOP, Collections, and File I/O
- Mini-projects for resumes or college assignments
- Practicing real-world Java development with modular code

---

📝 License

This project is free to use for learning and educational purposes.
