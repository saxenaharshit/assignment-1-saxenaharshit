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
    public void add(Person data) {

    }

    @Override
    public void remove() {

    }

    @Override
    public void search(String firstName) {

    }

    @Override
    public void print() {

    }
}
