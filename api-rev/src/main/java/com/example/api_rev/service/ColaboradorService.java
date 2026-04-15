package com.example.api_rev.service;

import com.example.api_rev.model.ColaboradorModel;
import com.example.api_rev.model.FuncionarioModel;
import com.example.api_rev.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorService {

    @Autowired
    private ColaboradorRepository repository;


    public List<ColaboradorModel>list(){
        return repository.findAll();
    }

    public ColaboradorModel salvar(ColaboradorModel model){
        if(repository.findByEmail(model.getEmail()).isPresent()){
            throw new RuntimeException("Colaborador já cadastrado!");
        }
        return repository.save(model);
    }

    public ColaboradorModel atualizar(Long id, ColaboradorModel model) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Colaborador não encontrado!");
        }
        model.setId(id);
        return repository.save(model);
    }

    public void excluir(Long id){
        if(!repository.existsById(id)){
            throw new RuntimeException("Colaborador excluido com sucesso!");
        }

    }
}
