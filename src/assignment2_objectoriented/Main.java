package assignment2_objectoriented;

import java.util.ArrayList;

public class Main{

    public static void main(String[] args){
        ArrayList<Person> persons = Storage.fetchPersons();

        // Make the capacity no bigger than the number of elements
        persons.trimToSize();

        System.out.println(persons);
    }
}
