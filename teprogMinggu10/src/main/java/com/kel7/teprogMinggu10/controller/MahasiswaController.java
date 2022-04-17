package com.kel7.teprogMinggu10.controller;
import java.util.List;

import com.kel7.teprogMinggu10.model.Mahasiswa;
import com.kel7.teprogMinggu10.service.MahasiswaService;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;
//mark class as Controller  
@RestController  
public class MahasiswaController   
{  
//autowire the MahasiswaService class  
@Autowired  
MahasiswaService mahasiswaService; 
//creating a get mapping that retrieves all the mahasiswas detail from the database   
@GetMapping("/mahasiswas")  
private List<Mahasiswa> getAllMahasiswas()   
{  
return mahasiswaService.getAllMahasiswas();  
}  
//creating a get mapping that retrieves the detail of a specifi"/mahasiswa  
@GetMapping("/mahasiswa/{NIM}")  
private Mahasiswa getMahasiswa(@PathVariable("NIM") int NIM)   
{  
return mahasiswaService.getMahasiswabyId(NIM);  
}  
//creating a delete mapping that deletes a specifie"/mahasiswa  
@DeleteMapping("/mahasiswa/{NIM}")  
private void deleteMahasiswa(@PathVariable("NIM") int NIM)   
{  
mahasiswaService.delete(NIM);  
}  
//creating post mapping that post th"/mahasiswa detail in the database  
@PostMapping("/mahasiswas")  
private int saveMahasiswa(@RequestBody Mahasiswa mahasiswas)   
{  
mahasiswaService.saveOrUpdate(mahasiswas);  
return mahasiswas.getNIM();  
}  
//creating put mapping that updates th"/mahasiswa detail   
@PutMapping("/mahasiswas")  
private Mahasiswa update(@RequestBody Mahasiswa mahasiswas)   
{  
mahasiswaService.saveOrUpdate(mahasiswas);  
return mahasiswas;  
}  
}  