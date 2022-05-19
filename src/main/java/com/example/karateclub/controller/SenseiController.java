package com.example.karateclub.controller;

import com.example.karateclub.model.Sensei;
import com.example.karateclub.repository.SenseiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("sensei")
public class SenseiController {

    @Autowired
    private SenseiRepository senseiRepository;

    @GetMapping
    public List<Sensei> getAllSensei(){
        return senseiRepository.findAll();
    }

    @PostMapping
    public Sensei post(@RequestBody Sensei sensei){
        return senseiRepository.save(sensei);
    }

    @PutMapping
    public Sensei put(@RequestBody Sensei sensei){
        return senseiRepository.save(sensei);
    }

}
