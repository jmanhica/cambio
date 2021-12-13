package com.consultas.cambios.Repository;

import com.consultas.cambios.model.Cambio;
import com.consultas.cambios.model.Rates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CambioRepository extends JpaRepository<Cambio, Long> {

   /* @Query("SELECT rates FROM Cambio c c.currency = :currency")
    List<Rates>  getRatesByCambio(String currency);*/
}
