package execution;

import defination.ContBook;
import defination.ContManage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContBook contact = new ContBook();
        while(true) {
            ContManage maintainContact = new ContManage();
            System.out.println("Welcome to DBC's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
        }
    }
}