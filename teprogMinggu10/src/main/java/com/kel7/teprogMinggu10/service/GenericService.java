package com.kel7.teprogMinggu10.service;
import java.util.List;
import com.kel7.teprogMinggu10.model.Person;
public interface GenericService<T extends Person> {
    List<T> findAll() throws Exception;
	T save(T entity) throws Exception;
	void delete(Long id) throws Exception;
}
