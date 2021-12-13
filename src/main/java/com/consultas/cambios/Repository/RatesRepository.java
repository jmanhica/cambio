package com.consultas.cambios.Repository;

import com.consultas.cambios.model.Rates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatesRepository extends JpaRepository<Rates, Long> {
    @Query(value = "SELECT * FROM RATES  WHERE RATES.CURRENCY = :currency", nativeQuery = true)
    List<Rates> findByCurrency(String currency);
}
