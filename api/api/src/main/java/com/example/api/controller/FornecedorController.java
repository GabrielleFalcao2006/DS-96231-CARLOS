package com.example.api.controller;


import com.example.api.model.FornecedorModel;
import com.example.api.repository.FornecedorRepository;
import com.example.api.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/fornecedores")
@RestController
public class FornecedorController {

    @Autowired
    public FornecedorRepository repository;


    @GetMapping
    public List<FornecedorModel>listar(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<FornecedorModel>save(@RequestBody FornecedorModel model){
        repository.save(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(model);
    }
}
