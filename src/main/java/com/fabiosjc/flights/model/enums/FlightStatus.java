package com.fabiosjc.flights.model.enums;

/**
 * Representa os status de um vôo, informando sobre o que aconteceu ou está acontecendo com ele.
 *
 * @author fabio on 20/08/17.
 */
public enum FlightStatus {
    SCHEDULED ("Scheduled"),
    EN_ROUTE ("En Route"),
    DELAYED ("Delayed"),
    LANDED ("Landed"),
    UNKNOWN ("Unknown");

    private String status;

    FlightStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}