package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PersonController {


@Autowired
PersonRepository personRepository;
    @PostMapping("/people")
    Person createPerson(@RequestBody Person p){

        return null;
    }

    @GetMapping("/people/{id}")
    Person getPerson(@PathVariable int id){
        return null;
    }

    @GetMapping("/people/all")
    List<Person> getPersonList(){
        return null;
    }

    @DeleteMapping("/people/{id}")
    void  deletePerson(@PathVariable int id){

    }

}
