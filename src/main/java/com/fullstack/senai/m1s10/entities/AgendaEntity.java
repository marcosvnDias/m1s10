package com.fullstack.senai.m1s10.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "agendas")
@Data
public class AgendaEntity {
    @Id private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private AlunoEntity aluno;

    @ManyToOne
    @JoinColumn(name = "tutor_id")
    private TutorEntity tutor;

    private Date data;
    private String status;
    private String tema;
    private String descricao;
}
