Design a class Book containing following members:
bookID text
title text
author text
category text
price float
    Define Parameterized constructor to initialize Book object. Perform the below validations
        • Category must be “Science”, “Fiction”, “Technology” or “Others”
        • Price cannot be negative
        • bookID must start with ‘B’ and must be of length 4 characters
If any of the validations fail, throw an user defined exception InvalidBookException.

Design a class called BookStore which contains an appropriate collection object to store Book instances.
Implement the below operations.
1. addBook(Book b)
To add a new Book object into the collection.
2. searchByTitle(String title)
Search a book based on title and if found, display the details
3. searchByAuthor(String author)
Search a book based on author and if found, display the details
4. displayAll()
Print the details of all the books
