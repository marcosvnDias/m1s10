package com.fullstack.senai.m1s10.repositories;

import com.fullstack.senai.m1s10.entities.TutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends JpaRepository<TutorEntity, Long> {
}
