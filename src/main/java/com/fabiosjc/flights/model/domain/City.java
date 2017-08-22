package com.fabiosjc.flights.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Representação simplificada de uma cidade
 *
 *@author fabio on 20/08/17.
 */
@Entity
public class City implements Serializable {

    private Long id;
    private String name;

    public City() {
    }

    public City(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

