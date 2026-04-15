package com.example.api_rev.controller;


import com.example.api_rev.model.FuncionarioModel;
import com.example.api_rev.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService service;

    @GetMapping
    public List<FuncionarioModel>list(){
        return service.list();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>>save(@RequestBody FuncionarioModel model){
        service.save(model);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem:", "Funcionário salvo com sucesso!"));
    }

   @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>>atualizarFuncionario(
            @PathVariable Long id,
            @RequestBody FuncionarioModel model){
        service.atualizarFuncionario(id, model);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem: ","Funcionário atualizado com sucesso!"));
   }


   @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>>excluirFuncionario(@PathVariable Long id){
        service.excluir(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem: ", "Funcionário deletado com sucesso!"));
   }
}
