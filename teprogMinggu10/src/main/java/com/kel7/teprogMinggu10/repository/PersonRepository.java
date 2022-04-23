package com.kel7.teprogMinggu10.repository;  
import com.kel7.teprogMinggu10.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;  
//repository that extends CrudRepository
@Repository  
public interface PersonRepository <T extends Person> extends CrudRepository<T, Long>  
{  
} 