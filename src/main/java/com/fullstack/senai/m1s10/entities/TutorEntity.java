package com.fullstack.senai.m1s10.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tutores")
@Data
public class TutorEntity {
    @Id private Long id;
    private String nome;
    private String especialidade;
}
