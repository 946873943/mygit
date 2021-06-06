package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    public void work(BookList bookList){
        Scanner sc = new Scanner(System.in);
        System.out.println("删除图书！！");
        System.out.println("请输入要删除的书籍： ");
        String name = sc.next();
        int pos = -1;
        int i = 0;
        for (; i < bookList.getUsedSize() ; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)){
                System.out.println("找到了！");
                pos = i;
                break;
            }
        }
        if (i>= bookList.getUsedSize()){
            System.out.println("没找到"+name+"这本书！");
            return;
        }
        int ret = bookList.getUsedSize();
        for (int j = pos; j < bookList.getUsedSize()-1 ; j++) {
            bookList.setBooks(i, bookList.getBook(i+1));
        }
        bookList.setUsedSize(ret-1);
        System.out.println("删除成功！");
    }
}
