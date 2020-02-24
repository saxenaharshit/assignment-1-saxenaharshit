package defination;

import helpingclasses.Person;
import java.util.ArrayList;
import java.util.Scanner;

public class ContManage {
    Person person = new Person();
    Scanner sc = new Scanner( System.in );
    public Person add(){
        System.out.println( "You have chosen to add a new contact:" );
        System.out.println( "Please enter the name of the person" );
        System.out.print( "First Name:" );
        person.setFirstName( sc.nextLine() );
        System.out.print( "Last Name:" );
        person.setLastName( sc.nextLine() );
        ArrayList<String> number = new ArrayList<>();
        while(true) {
            System.out.print( "Contact Number:" );
            number.add( sc.nextLine() );
            System.out.print( "Would you like to add another contact number? (y/n):" );
            if(sc.nextLine().equals( "n" ))
                break;
        }
        person.setContactNumber( number );
        System.out.print( "Would you like to add email address? (y/n): " );
        if(sc.nextLine().equals( "y" )) {
            System.out.print( "Email:" );
            person.setEmail( sc.nextLine() );

        }
        return person;
    }




}