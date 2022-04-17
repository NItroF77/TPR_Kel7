package com.kel7.teprogMinggu10.controller;
import java.util.List;

import com.kel7.teprogMinggu10.model.Mahasiswa;
import com.kel7.teprogMinggu10.service.BooksService;

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
//autowire the BooksService class  
@Autowired  
BooksService booksService;  
//creating a get mapping that retrieves all the books detail from the database   
@GetMapping("/mahasiswa")  
private List<Mahasiswa> getAllMahasiswa()   
{  
return booksService.getAllMahasiswa();  
}  
//creating a get mapping that retrieves the detail of a specifi"/mahasiswa  
@GetMapping("/mahasiswa/{NIM}")  
private Mahasiswa getBMahasiswathVariable("NIM") int NIM)   
{  
return booksService.getById(NIM);  
}  
//creating a delete mapping that deletes a specifie"/mahasiswa  
@DeleteMapping("/mahasiswa/{NIM}")  
private void deleteBook(@PathVariable("NIM") int NIM)   
{  
booksService.delete(NIM);  
}  
//creating post mapping that post th"/mahasiswa detail in the database  
@PostMapping("/books")  
private int saveBook(@RequestBody Mahasiswa books)   
{  
booksService.saveOrUpdate(books);  
return books.getBookid();  
}  
//creating put mapping that updates th"/mahasiswa detail   
@PutMapping("/books")  
private Mahasiswa update(@RequestBody Mahasiswa books)   
{  
booksService.saveOrUpdate(books);  
return books;  
}  
}  