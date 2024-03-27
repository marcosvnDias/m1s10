package com.fullstack.senai.m1s10.services;

import com.fullstack.senai.m1s10.entities.AlunoEntity;
import com.fullstack.senai.m1s10.exceptions.NotFountException;
import com.fullstack.senai.m1s10.repositories.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {
    private final AlunoRepository repository;

    public AlunoServiceImpl(AlunoRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<AlunoEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public AlunoEntity buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFountException(
                        "Aluno não encontrado com id:" + id)
                );
    }

    @Override
    public AlunoEntity criar(AlunoEntity entity) {
        return repository.save(entity);
    }

    @Override
    public AlunoEntity alterar(Long id, AlunoEntity entity) {
        buscarPorId(id);
        entity.setId(id);
        return repository.save(entity);
    }

    @Override
    public void excluir(Long id) {
        AlunoEntity entity = buscarPorId(id);
        repository.delete(entity);
    }
}
