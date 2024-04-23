package Services;

import Interfaces.IBooksService;
import Models.Books;
import Models.Data;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;


public class BooksService implements IBooksService {



    @Override
    public void GetAllBooks() {
        ArrayList<Books> Books = Data.books;
        for (Books b:Books){
            System.out.println("book"+",id:"+b.getId()+",Author:"+b.getauthor()+",title:"+b.getTitle()+",publication year:"+b.getpublicationyear());
        }
    }

    @Override
    public void AddBook(Books book) {
        if(book.getauthor().equals(null)||book.getauthor().equals(""))
            throw new NullPointerException("author can't be empty");
        if(book.getTitle().equals(null)||book.getTitle().equals(""))
            throw new NullPointerException("title can't be empty");
        if(book.getpublicationyear()> Year.now().getValue())
            throw new NullPointerException("publication year can't be after this year");
        book.SetId(Data.books.size()+1);
        Data.books.add(book);
    }

    @Override
    public void UpdateBook( int id,Books book) {
        boolean BookExist = false;
        for(Books b:Data.books){
            if(b.getId()==id){
                BookExist=true;
                b.Setauthor(book.getauthor());
                b.Setpublicationyear(book.getpublicationyear());
                b.Settitle(book.getTitle());
            }

        }
        if(!BookExist)
            throw new NullPointerException("Books Doesn't exist");
    }

    @Override
    public void DeleteBook( int id) {
        boolean BookExist = false;
        for(Books b:Data.books){
            if(b.getId()==id){
                BookExist=true;
                Data.books.remove(b);
            }
        }
        if(!BookExist)
            throw new NullPointerException("Books Doesn't exist");
    }
}
