package com.kel7.teprogMinggu10.model;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.Table;
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table(name = "Dosen")
public class Dosen extends Person{
    @Column  
    private int NIP;
    @Column
    private String MatKul;

    public int getNIP() {
        return this.NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public String getMatKul() {
        return this.MatKul;
    }

    public void setMatKul(String MatKul) {
        this.MatKul = MatKul;
    }

}
