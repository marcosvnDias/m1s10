package com.fullstack.senai.m1s10.services;

import com.fullstack.senai.m1s10.entities.AgendaEntity;
import com.fullstack.senai.m1s10.entities.MaterialEntity;
import com.fullstack.senai.m1s10.exceptions.NotFountException;
import com.fullstack.senai.m1s10.repositories.MaterialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService{
    private final MaterialRepository repository;
    private final AgendaService agendaService;

    public MaterialServiceImpl(MaterialRepository repository, AgendaService agendaService) {
        this.repository = repository;
        this.agendaService = agendaService;
    }

    @Override
    public List<MaterialEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public MaterialEntity buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFountException(
                        "Material não encontrado com id:" + id)
                );
    }

    @Override
    public MaterialEntity criar(MaterialEntity entity) {
        AgendaEntity agenda = agendaService.buscarPorId(entity.getAgenda().getId());
        entity.setAgenda(agenda);

        return repository.save(entity);
    }

    @Override
    public MaterialEntity alterar(Long id, MaterialEntity entity) {
        buscarPorId(id);
        AgendaEntity agenda = agendaService.buscarPorId(entity.getAgenda().getId());
        entity.setAgenda(agenda);

        return repository.save(entity);
    }

    @Override
    public void excluir(Long id) {
        MaterialEntity material = buscarPorId(id);
        repository.delete(material);
    }
}
