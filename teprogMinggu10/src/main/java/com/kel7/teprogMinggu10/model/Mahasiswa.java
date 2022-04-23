package com.kel7.teprogMinggu10.model;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table(name = "Mahasiswa")
public class Mahasiswa extends Person{  
    //Defining book id as primary key  
    @Column  
    private int NIM;
    @Column  
    private String Prodi;
    public int getNIM()   
    {  
    return NIM;  
    }  
    public void setNIM(int NIM)   
    {  
    this.NIM = NIM;  
    }    
    public String getProdi()   
    {  
    return Prodi;
    }  
    public void setProdi(String Prodi)   
    {
    this.Prodi = Prodi;
    }  
}  