package com.consultas.cambios.controller;

import com.consultas.cambios.model.Cambio;
import com.consultas.cambios.model.Rates;
import com.consultas.cambios.service.CambioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cambio")
public class CambioController {
    private CambioService cambioService;

    public CambioController(CambioService cambioService) {
        super();
        this.cambioService = cambioService;
    }

    @PostMapping()
    public ResponseEntity<Cambio> saveCambios(@RequestBody Cambio cambio) {
        return new ResponseEntity<Cambio>(cambioService.saveCambios(cambio), HttpStatus.CREATED);
    }

    @GetMapping()
    public List<Cambio> getAllCambios() {
        return cambioService.getAllCambios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cambio> getCambiosById(@PathVariable("id") long id){
        return new ResponseEntity<Cambio>(cambioService.getCambiosById(id), HttpStatus.OK);
    }

   /* @GetMapping("/rates/{currency}")
    public List<Rates> getRatesByCambio(@PathVariable("currency") String currency){
        return cambioService.getRatesByCambio(currency);
    }*/

   /* @GetMapping("/search")
    public ResponseEntity<List<Cambio>> getByCurrencyByName(@RequestParam(name = "currency") String currency){
        List<Cambio> rates = cambioService.getByCurrency(currency);
        return new ResponseEntity<List<Cambio>>(rates, HttpStatus.OK);
    }*/
}
