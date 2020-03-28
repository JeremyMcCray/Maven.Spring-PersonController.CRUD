package io.zipcoder.crudapp;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, JsonTypeInfo.Id> {

}
