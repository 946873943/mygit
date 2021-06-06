package operation;

import book.Book;
import book.BookList;

import java.util.Arrays;

public class DisplayOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("显示图书！！");
        for (int i = 0; i < bookList.getUsedSize() ; i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
