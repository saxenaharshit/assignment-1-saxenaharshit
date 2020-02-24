package execution;

import defination.ContBook;
import defination.ContManage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContBook contact = new ContBook();
        while (true) {
            ContManage maintainContact = new ContManage();
            System.out.println("Welcome to DBC's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    contact.add(maintainContact.add());
                    break;
                case 2:
                    contact.sortList();
                    contact.print();
                    break;
                case 3:
                    System.out.println("You could search for a contact from their first names:");
                    String firstName = sc.nextLine();
                    contact.search(firstName);
                    break;
                case 4:
                    contact.remove();
                    break;
                case 5:
                    break;
            }


        }
    }
}