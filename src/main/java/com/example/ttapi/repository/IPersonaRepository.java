package com.example.ttapi.repository;

import com.example.ttapi.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;

public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    @Modifying
    @Transactional
    Integer deleteByIdentificacion(String identificacion);

    Persona findByIdentificacion(String identificacion);
}
