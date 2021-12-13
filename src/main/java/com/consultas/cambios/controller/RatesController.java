package com.consultas.cambios.controller;

import com.consultas.cambios.model.Cambio;
import com.consultas.cambios.model.Rates;
import com.consultas.cambios.service.RatesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rates")
public class RatesController {
    private RatesService ratesService;

    public RatesController(RatesService ratesService) {
        super();
        this.ratesService = ratesService;
    }

    @PostMapping
    public Rates saveRates(@RequestBody Rates rates) {
      return ratesService.saveRates(rates);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rates> getPaisById(@PathVariable("id") long id){
        return new ResponseEntity<Rates>(ratesService.getRatesById(id), HttpStatus.OK);
    }

    @GetMapping()
    public List<Rates> getAllRates() {
        return ratesService.getAllRates();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Rates>> getByCurrencyByName(@RequestParam(name = "currency") String currency){
        List<Rates> rates = ratesService.getByCurrency(currency);
        return new ResponseEntity<List<Rates>>(rates, HttpStatus.OK);
    }
}
