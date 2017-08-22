package com.fabiosjc.flights.model.domain;

import com.fabiosjc.flights.model.enums.FlightStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Representa as informações sobre um determinado vôo
 *
 * @author fabio on 20/08/17.
 */
@Entity
public class Flight implements Serializable{

    private Long id;
    private String number;
    private FlightStatus flightStatus;
    private Date departure;
    private Date arrival;
    private City origin;
    private City destination;
    private BigDecimal duration;
    private Aircraft aircraft;
    private Pilot pilot;

    public Flight() {
        // default constructor
    }

    public Flight(String number) {
        this.number = number;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable = false, unique = true)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Column(name = "FLIGHT_STATUS")
    @Enumerated(EnumType.STRING)
    public FlightStatus getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(FlightStatus flightStatus) {
        this.flightStatus = flightStatus;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    @OneToOne
    @JoinColumn(name = "origin_id")
    public City getOrigin() {
        return origin;
    }

    public void setOrigin(City origin) {
        this.origin = origin;
    }

    @OneToOne
    @JoinColumn(name = "destination_id")
    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    @OneToOne
    @JoinColumn(name = "aircraft_id")
    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    @OneToOne
    @JoinColumn(name = "pilot_id")
    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }
}
