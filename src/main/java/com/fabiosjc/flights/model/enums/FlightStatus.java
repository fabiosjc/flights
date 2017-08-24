package com.fabiosjc.flights.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Representa os status de um vôo, informando sobre o que aconteceu ou está acontecendo com ele.
 *
 * @author fabio on 20/08/17.
 */
public enum FlightStatus {
    SCHEDULED ("Agendado"),
    EN_ROUTE ("Em Vôo"),
    DELAYED ("Atrasado"),
    LANDED ("Desembarcando"),
    CANCELED ("Cancelado"),
    UNKNOWN ("Desconhecido");

    private String label;

    FlightStatus(String label) {
        this.label = label;
    }

    @JsonValue
    public String getLabel() {
        return this.label;
    }

    @Override
    public String toString() {
        return getLabel();
    }
}