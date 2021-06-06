package user;
import operation.*;
import java.util.Scanner;
public class NormalUser extends User {
    public NormalUser (String name) {
        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }
    @Override
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========" + "欢迎 "+this.name+"=========");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("4.退出系统");
        System.out.println("==========================================");
        int choice = scanner.nextInt();
        return choice;
    }
}
