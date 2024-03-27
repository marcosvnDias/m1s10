package com.fullstack.senai.m1s10.services;

import com.fullstack.senai.m1s10.entities.AlunoEntity;

import java.util.List;

public interface AlunoService {
    List<AlunoEntity> buscarTodos();
    AlunoEntity buscarPorId(Long id);
    AlunoEntity criar(AlunoEntity entity);
    AlunoEntity alterar(Long id, AlunoEntity entity);
    void excluir(Long id);
}
