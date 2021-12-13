package com.consultas.cambios.service;

import com.consultas.cambios.Repository.CambioRepository;
import com.consultas.cambios.exception.ResourceNotFoundException;
import com.consultas.cambios.model.Cambio;
import com.consultas.cambios.model.Rates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CambioService {
    private CambioRepository cambioRepository;
    @Autowired
    public CambioService(CambioRepository cambioRepository) {
        super();
        this.cambioRepository = cambioRepository;
    }

    public Cambio saveCambios(Cambio cambio) {
        return cambioRepository.save(cambio);
    }

    public List<Cambio> getAllCambios() {
        return cambioRepository.findAll();
    }

    public Cambio getCambiosById(long id) {
        return cambioRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Cambio", "Id", id));
    }

   /* public List<Rates> getRatesByCambio(String currency) {
        return cambioRepository.getRatesByCambio(currency);
    }*/


}
