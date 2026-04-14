package com.example.api2.controller;

import com.example.api2.model.AlunoModel;
import com.example.api2.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    public AlunoRepository repository;


    @GetMapping
    public List<AlunoModel>listar(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<AlunoModel>save(@RequestBody AlunoModel model){
        repository.save(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(model);
    }
}
