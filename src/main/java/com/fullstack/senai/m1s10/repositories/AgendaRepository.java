package com.fullstack.senai.m1s10.repositories;

import com.fullstack.senai.m1s10.entities.AgendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AgendaRepository extends JpaRepository<AgendaEntity, Long> {
    List<AgendaEntity> findByAlunoIdOrderByData(Long alunoId);
    List<AgendaEntity> findByAlunoIdAndDataGreaterThanOrderByData(Long aluno_id, LocalDateTime data);
    List<AgendaEntity> findByTutorIdOrderByData(Long tutorId);
    List<AgendaEntity> findByTutorIdAndDataGreaterThanOrderByData(Long tutor_id, LocalDateTime data);
}
