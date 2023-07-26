package com.example.ttapi.repository;

import com.example.ttapi.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFacturaRespository extends JpaRepository<Factura, Long> {
    List<Factura> getAllByPersonaId(Long personaId);
}
