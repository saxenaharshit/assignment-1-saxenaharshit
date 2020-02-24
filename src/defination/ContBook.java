package defination;

import adt.ADT;
import nodeClass.Node;
import helpingclasses.Person;
import java.util.Scanner;

public class ContBook implements ADT<Person> {

    Scanner sc = new Scanner( System.in );

    Node<Person> head;

    public ContBook(){
        head = null;
    }


    public Node getHead(){
        return head;
    }

    @Override
    public void add(Person data){
        Node node = new Node( data );

        if(head == null) {
            head = node;
        }
        else{
            Node temp = head;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext( node );
        }
    }

    @Override
    public void remove(){
        Node response = null;
        if(head != null) {
            Node<Person> temp = head;
            Node previous = null;
            int count = 0;
            int index = printName();
            sc.nextLine();
            while(count < index - 1) {
                previous = temp;
                temp = temp.getNext();
                count++;
            }
            System.out.println( temp.getData().getFirstName() + " " + temp.getData().getLastName() + "'s contact deleted from the list!" );

            if(previous != null) {
                response = previous.getNext();
                previous.setNext( null );

            }
            else{
                response = head;
                head = null;
            }

        }

    }

    @Override
    public void search(String firstName) {

    }

    @Override
    public void print() {

    }

    public int printName(){
        System.out.println( "---Here are all your contacts---" );
        Node<Person> temp = head;
        int sNo = 1;
        while(temp != null) {
            System.out.println( sNo++ + ". " + temp.getData().getFirstName() + " " + temp.getData().getLastName() );
            temp = temp.getNext();
        }
        System.out.print( "Press the number against the contact to delete it:" );
        return sc.nextInt();
    }


}
