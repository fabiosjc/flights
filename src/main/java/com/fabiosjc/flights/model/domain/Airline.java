package com.fabiosjc.flights.model.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Representação simplificada de uma companhia aérea
 *
 * @author fabio on 23/08/17.
 */
@Entity
public class Airline {
    private Long id;
    private String name;

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
