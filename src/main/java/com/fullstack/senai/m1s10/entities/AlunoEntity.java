package com.fullstack.senai.m1s10.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "alunos")
@Data
public class AlunoEntity {
    @Id private Long id;
    private String nome;
}
