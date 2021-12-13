package com.consultas.cambios.service;

import com.consultas.cambios.Repository.RatesRepository;
import com.consultas.cambios.exception.ResourceNotFoundException;
import com.consultas.cambios.model.Cambio;
import com.consultas.cambios.model.Rates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatesService {
    private RatesRepository ratesRepository;

    @Autowired
    public RatesService(RatesRepository ratesRepository) {
        this.ratesRepository = ratesRepository;
    }

    public Rates saveRates(Rates rates) {
        return ratesRepository.save(rates);
    }

    public List<Rates> getAllRates() {
        return ratesRepository.findAll();
    }

    public Rates getRatesById(long id) {
        return ratesRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Pais", "Id", id));
    }

    public List<Rates> getByCurrency(String currency) {
        return ratesRepository.findByCurrency(currency);
    }
}
