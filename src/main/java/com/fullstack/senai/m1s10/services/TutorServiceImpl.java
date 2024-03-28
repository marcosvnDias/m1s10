package com.fullstack.senai.m1s10.services;

import com.fullstack.senai.m1s10.entities.TutorEntity;
import com.fullstack.senai.m1s10.exceptions.NotFountException;
import com.fullstack.senai.m1s10.repositories.TutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorServiceImpl implements TutorService{
    private final TutorRepository repository;

    public TutorServiceImpl(TutorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TutorEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public TutorEntity buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFountException(
                        "Tutor não encontrado com id:" + id)
                );
    }

    @Override
    public TutorEntity criar(TutorEntity entity) {
        return repository.save(entity);
    }

    @Override
    public TutorEntity alterar(Long id, TutorEntity entity) {
        buscarPorId(id);
        entity.setId(id);
        return repository.save(entity);
    }

    @Override
    public void excluir(Long id) {
        TutorEntity entity = buscarPorId(id);
        repository.delete(entity);
    }
}
