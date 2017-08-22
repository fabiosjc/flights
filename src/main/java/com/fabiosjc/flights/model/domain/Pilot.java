package com.fabiosjc.flights.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Represanta as informações de um Piloto
 *
 * Created by fabio on 20/08/17.
 */
@Entity
public class Pilot {

    private Long id;
    private String name;

    public Pilot() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
