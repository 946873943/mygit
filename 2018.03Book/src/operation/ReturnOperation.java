package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList booklist) {
        Scanner sc = new Scanner(System.in);
        System.out.println("归还图书！！");
        System.out.println("输入要归还的书籍： ");
        String name = sc.next();
        int i = 0;
        Book book = booklist.getBook(i);
        for (; i < booklist.getUsedSize(); i++) {
            if (book.getName().equals(name)) {
                System.out.println("归还成功！");
                break;
            } else {
                System.out.println("归还失败！");
                System.out.println("没有" + name + "这本书");
            }
            return;
        }
    }
}
