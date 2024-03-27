package com.fullstack.senai.m1s10.repositories;

import com.fullstack.senai.m1s10.entities.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {

}
