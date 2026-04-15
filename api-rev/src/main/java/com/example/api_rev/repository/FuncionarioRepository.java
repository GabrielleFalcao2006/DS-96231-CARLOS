package com.example.api_rev.repository;


import com.example.api_rev.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {

    //optinal: procurar a partir do email.
    Optional<FuncionarioModel> findByEmail(String email);
}
