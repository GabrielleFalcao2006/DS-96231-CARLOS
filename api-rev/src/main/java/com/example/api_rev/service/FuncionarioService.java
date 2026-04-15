package com.example.api_rev.service;


import com.example.api_rev.model.FuncionarioModel;
import com.example.api_rev.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioModel>list(){
        return repository.findAll();
    }

    public FuncionarioModel save(FuncionarioModel funcionario){
        if(repository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new RuntimeException("Funcionário já cadastrado!");
        }
        return repository.save(funcionario);
    }

    public FuncionarioModel atualizarFuncionario(Long id, FuncionarioModel model){
        if(!repository.existsById(id)) {
            throw new IllegalArgumentException(((((((("Funcionário não encontrado!"))))))));
        }
        //Mantém o id para não criar outro funcionário.
        //Altera todos os outros dados.
        model.setId(id);
        return repository.save(model);
    }

    public void excluir(Long id)  {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException(((((((("Funcionário não encontrado!"))))))));
        }
        repository.deleteById(id);
    }

}
