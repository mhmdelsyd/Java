package Interfaces;

import Models.Books;

import java.awt.*;
import java.util.ArrayList;


public interface IBooksService {
    public void GetAllBooks();
    public void AddBook(Books book);
    public void UpdateBook(int id,Books book);
    public void DeleteBook(int id);
}
