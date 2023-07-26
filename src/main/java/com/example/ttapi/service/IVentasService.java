package com.example.ttapi.service;

import com.example.ttapi.model.Factura;
import org.springframework.http.ResponseEntity;

public interface IVentasService {
    ResponseEntity<Object> findFacturasByPersona(Long personaId);

    ResponseEntity<Object> storeFactura(Factura factura);
}
