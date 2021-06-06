package book;

import java.util.Arrays;

public class BookList {
    @Override
    public String toString() {
        return "BookList{" +
                "books=" + Arrays.toString(books) +
                ", usedSize=" + usedSize +
                '}';
    }

    private Book[] books = new Book[10];
    private  int usedSize;
public BookList(){
    books[0] = new Book("水浒传","施耐庵",29,"小说");
    books[1] = new Book("泰罗奥特曼","张三",22,"漫画");
    books[2] = new Book("迪迦奥特曼","李四",22,"漫画");
    this.usedSize = 3;
}

    public void setBooks(int pos, Book book){

    this.books[pos] = book;
    }

    public Book getBook(int pos){

        return this.books[pos];
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }


    public int getUsedSize(){

    return usedSize;
    }
    public void setUsedSize(int usedSize){

    this.usedSize = usedSize;
    }

}
