package com.fabiosjc.flights.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Representação simplificada da entidade Aeronave
 *
 * @author fabio on 20/08/17.
 */
@Entity
public class Aircraft implements Serializable {

    private Long id;
    private String model;
    private String number;

    public Aircraft() {
        // default constructor
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}