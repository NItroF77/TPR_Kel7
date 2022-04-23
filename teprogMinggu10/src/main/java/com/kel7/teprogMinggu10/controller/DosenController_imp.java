package com.kel7.teprogMinggu10.controller;
import com.kel7.teprogMinggu10.model.Dosen;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/dosen")
public class DosenController_imp extends PersonController_imp<Dosen> implements DosenController {
    
}
