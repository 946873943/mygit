package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    public void work(BookList bookList){
        Scanner sc = new Scanner(System.in);
        System.out.println("借阅图书！！");
        System.out.println("请输入想要借阅的书籍： ");
        String name = sc.nextLine();
        int i = 0;
        Book book = bookList.getBook(i);
        for (; i < bookList.getUsedSize(); i++) {
            if (book.getName().equals(name)){
                System.out.println("借出成功！");
                break;
            }else{
                System.out.println("借出失败！");
                System.out.println("没有" +name +"这本书");
            }
            return;
        }
    }
}
