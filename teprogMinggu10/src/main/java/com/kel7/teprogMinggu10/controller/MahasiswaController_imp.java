package com.kel7.teprogMinggu10.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kel7.teprogMinggu10.model.Mahasiswa;
@RestController
@RequestMapping(path = "/mahasiswa")
public class MahasiswaController_imp extends PersonController_imp<Mahasiswa> implements MahasiswaController {
    
}
