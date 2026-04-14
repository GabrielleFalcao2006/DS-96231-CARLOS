package com.example.api.controller;


import com.example.api.model.FuncionarioModel;
import com.example.api.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @GetMapping
   public List<FuncionarioModel>listar(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<FuncionarioModel>save(@RequestBody FuncionarioModel funcionarioModel){
        repository.save(funcionarioModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioModel);

    }
}
