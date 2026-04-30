package com.example.DTO.repository;


import com.example.DTO.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel,Long> {

    Optional<FuncionarioModel>finfByEmail(String email);
}
