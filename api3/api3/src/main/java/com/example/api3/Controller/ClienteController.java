package com.example.api3.Controller;


import com.example.api3.Model.ClienteModel;
import com.example.api3.Repository.ClienteRepository;
import com.example.api3.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    public ClienteService service;

    @GetMapping
    public List<ClienteModel>lista(){
        return service.listar();
    }

    @PostMapping
    public ResponseEntity<Map<Object,String>>save(@RequestBody ClienteModel model){
        service.salvar(model);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem","Cliente cadastrado com sucesso"));
    }
}
