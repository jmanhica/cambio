package com.consultas.cambios.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Rates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String currency;
    private Double purchase;
    private Double sale;

    public Rates() {}
    public Rates(Long id, String currency, Double purchase, Double sale) {
        this.id = id;
        this.currency = currency;
        this.purchase = purchase;
        this.sale = sale;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getPurchase() {
        return purchase;
    }

    public void setPurchase(Double purchase) {
        this.purchase = purchase;
    }

    public Double getSale() {
        return sale;
    }

    public void setSale(Double sale) {
        this.sale = sale;
    }



    @Override
    public String toString() {
        return "Rates{" +
                "id=" + id +
                ", currency='" + currency + '\'' +
                ", purchase=" + purchase +
                ", sale=" + sale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rates rates = (Rates) o;
        return Objects.equals(id, rates.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
