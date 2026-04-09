package com.example.api3.Service;


import com.example.api3.Model.ClienteModel;
import com.example.api3.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<ClienteModel>listar(){
        return repository.findAll();
    }

    public ClienteModel salvar(ClienteModel cliente){

        //Verifica se o cliente não está cadastrado no banco de dados antes de salvar.
        if (repository.findByEmail(cliente.getEmail()).isPresent()){
            throw new IllegalArgumentException("Cliente já cadastrado!");
        }
        return repository.save(cliente);
    }
}
