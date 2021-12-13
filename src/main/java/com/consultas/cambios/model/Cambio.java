package com.consultas.cambios.model;



import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;


@Entity
public class Cambio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String provider;
    private String baseCurrency;
    private Timestamp dateTime;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cambio_id",referencedColumnName = "id")
    private List<Rates> rates;

    public Cambio(){}

    public Cambio(Long id, String provider, String baseCurrency, Timestamp dateTime, List<Rates> rates) {
        this.id = id;
        this.provider = provider;
        this.baseCurrency = baseCurrency;
        this.dateTime = dateTime;
        this.rates = rates;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public List<Rates> getRates() {
        return rates;
    }

    public void setRates(List<Rates> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Cambio{" +
                "id=" + id +
                ", provider='" + provider + '\'' +
                ", baseCurrency='" + baseCurrency + '\'' +
                ", dateTime=" + dateTime +
                ", rates=" + rates +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cambio cambio = (Cambio) o;
        return Objects.equals(id, cambio.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
