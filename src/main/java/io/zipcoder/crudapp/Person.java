package io.zipcoder.crudapp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

    @Id()
    Integer id;
    String firstName;
    String lastName;


    public Person(String first, String last, Integer id){
        this.firstName=first;
        this.lastName=last;
        this.id=id;
    }

    public Person(){}



}
