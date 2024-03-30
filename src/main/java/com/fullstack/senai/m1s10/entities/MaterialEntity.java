package com.fullstack.senai.m1s10.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "materiais")
@Data
public class MaterialEntity {
    @Id private Long id;

    @ManyToOne
    @JoinColumn(name = "agenda_id")
    private AgendaEntity agenda;
    private String descricao;

    @JoinColumn(name = "caminho_arquivo")
    private String caminhoArquivo;
}
