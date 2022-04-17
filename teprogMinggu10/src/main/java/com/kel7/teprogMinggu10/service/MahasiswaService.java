package com.kel7.teprogMinggu10.service;
import java.util.ArrayList;  
import java.util.List;

import com.kel7.teprogMinggu10.model.Mahasiswa;
import com.kel7.teprogMinggu10.repository.MahasiswaRepository;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
//defining the business logic  
@Service  
public class MahasiswaService   
{  
@Autowired  
MahasiswaRepository MhsRepository;


//getting all books record by using the method findaAll() of CrudRepository  
public List<Mahasiswa> getAllMahasiswas()   
{  
List<Mahasiswa> Mhslist = new ArrayList<Mahasiswa>();  
MhsRepository.findAll().forEach(Mhs1 -> Mhslist.add(Mhs1));  
return Mhslist;  
}  


//getting a specific record by using the method findById() of CrudRepository  
public Mahasiswa getMahasiswabyId(int id)   
{  
return MhsRepository.findById(id).get();  
}  


//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Mahasiswa MhsList)   
{  
MhsRepository.save(MhsList);  
}  


//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int NIM)   
{  
MhsRepository.deleteById(NIM);  
}  


//updating a record  
public void update(Mahasiswa Mhs, int NIM)   
{  
MhsRepository.save(Mhs);  
}  


}  