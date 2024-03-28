package com.fullstack.senai.m1s10.services;

import com.fullstack.senai.m1s10.entities.AlunoEntity;
import com.fullstack.senai.m1s10.entities.TutorEntity;

import java.util.List;

public interface TutorService {
    List<TutorEntity> buscarTodos();
    TutorEntity buscarPorId(Long id);
    TutorEntity criar(TutorEntity entity);
    TutorEntity alterar(Long id, TutorEntity entity);
    void excluir(Long id);
}
