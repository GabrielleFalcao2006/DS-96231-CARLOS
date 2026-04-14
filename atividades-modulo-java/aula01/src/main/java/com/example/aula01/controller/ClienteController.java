package com.example.aula01.controller;


import com.example.aula01.model.ClienteModel;
import com.example.aula01.repository2.ClienteRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//EndPoint
@RestController
@RequestMapping ("/cliente")
public class ClienteController {

    @Autowired //SUBSTITUI O CONSTRUTOR (SÓ NO CONTROLLER)
    private ClienteRepository2 repository2;

    //GET (pegar dados)
    @GetMapping()
    public List listar(){
        return repository2.findAll();
    }

    @PostMapping()
    public ResponseEntity<ClienteModel>salvar(@RequestBody ClienteModel model){
        repository2.save(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(model);
    }



}
