import Models.Books;
import Services.BooksService;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            BooksService _bookservice = new BooksService();
            Books book1 = new Books("book1","mohamed",2020);
            Books book2 = new Books("book2","mohamed",2015);
            Books book3 = new Books("book3","mohamed",2015);
            Books book4 = new Books("book4","mohamed",2012);
            _bookservice.AddBook(book1);
            _bookservice.AddBook(book2);
            _bookservice.AddBook(book3);
            _bookservice.AddBook(book4);
            _bookservice.GetAllBooks();
            _bookservice.DeleteBook(3);
            Books book4edit = new Books("bookedit","ahmed",2012);
            _bookservice.UpdateBook(4,book4edit);
            _bookservice.GetAllBooks();


        }

}

