package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    public void work(BookList bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("添加图书！！");
        System.out.println("请输入需要添加的书籍： ");
        String str1 = scanner.next();
        System.out.println("请输入作者： ");
        String str2 = scanner.next();
        System.out.println("请输入价格： ");
        int str3 = scanner.nextInt();
        System.out.println("请输入类型：");
        String str4 = scanner.next();
        for (int i = 0; i < bookList.getUsedSize() ; i++) {
            if (bookList.getBook(i).getName().equals(str1)){
                System.out.println(str1+"已存在，添加失败！");
                return;
            }
        }
        Book book = new Book(str1,str2,str3,str4);
        int ret = bookList.getUsedSize();
        bookList.setUsedSize(bookList.getUsedSize()+1);
        bookList.setBooks(ret,book);
        System.out.println("添加成功！");


    }
}
