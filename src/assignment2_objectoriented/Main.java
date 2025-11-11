package assignment2_objectoriented;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){
        List<Person> persons = Storage.fetchPersons();

        System.out.println(persons);
    }
}
