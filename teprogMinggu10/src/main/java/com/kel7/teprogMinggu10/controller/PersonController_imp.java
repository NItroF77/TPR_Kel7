package com.kel7.teprogMinggu10.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.kel7.teprogMinggu10.model.Person;
import com.kel7.teprogMinggu10.service.GenericService;
@SuppressWarnings({"unchecked","rawtypes"})
@ResponseBody
public class PersonController_imp<T extends Person> implements PersonController<T> {
    @Autowired
    private GenericService<T> genericService;
    @Override
    @PostMapping
    public ResponseEntity<Object> save(T entity) {
        try {
            return new ResponseEntity(genericService.save(entity),HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("LOL",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @GetMapping
    public ResponseEntity<T> findAll() {
        try {
            return new ResponseEntity(genericService.findAll(),HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("LOL",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        try {
            genericService.delete(id);
            return new ResponseEntity("Success",HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("failed deleted",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
