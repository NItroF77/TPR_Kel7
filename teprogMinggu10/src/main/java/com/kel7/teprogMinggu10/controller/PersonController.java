package com.kel7.teprogMinggu10.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.kel7.teprogMinggu10.model.Person;
public interface PersonController<T extends Person> {
    ResponseEntity<Object> save(@RequestBody T entity);
	ResponseEntity<T> findAll();
	ResponseEntity<String> delete(@PathVariable Long id);
}
