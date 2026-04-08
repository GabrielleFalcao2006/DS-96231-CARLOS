package com.example.api2.repository;

import com.example.api2.model.AlunoModel;
import com.example.api2.model.ProfessorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository <ProfessorModel,Long> {
}
