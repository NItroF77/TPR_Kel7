package com.kel7.teprogMinggu10.model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@MappedSuperclass  
public class Person {
    @Id
    private Long ID;
    private String name;

    public Person(Long ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public Person() {
    }

    public Long getID() {
        return this.ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
