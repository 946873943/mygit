package user;

import book.BookList;
import operation.IOperation;
import javax.imageio.stream.ImageOutputStreamImpl;

public abstract  class User {
    public String name;

    public IOperation[] iOperations;
    public User(String name){
        this.name = name;
    }
    abstract  public int  menu();
    public void doOperation(int choice , BookList bookList){
        iOperations[choice].work(bookList);
    }
}
