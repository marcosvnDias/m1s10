package com.fullstack.senai.m1s10.repositories;

import com.fullstack.senai.m1s10.entities.AgendaEntity;
import com.fullstack.senai.m1s10.entities.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialRepository extends JpaRepository<MaterialEntity, Long> {
    List<MaterialEntity> findByAgenda(AgendaEntity agenda);
}
