package com.fabiosjc.flights.core.builder;

import com.fabiosjc.flights.model.domain.City;
import com.fabiosjc.flights.model.domain.Flight;

import java.util.Date;

/**
 * Created by fabio on 22/08/17.
 */
public class FlightBuilder {

    private Flight flight = new Flight();

    public FlightBuilder(String number) {
        this.flight.setNumber(number);
    }

    public FlightBuilder from(City city) {
        this.flight.setOrigin(city);
        return this;
    }

    public FlightBuilder to(City city) {
        this.flight.setOrigin(city);
        return this;
    }

    public FlightBuilder departure(Date departure) {
        this.flight.setDeparture(departure);
        return this;
    }

    public FlightBuilder arrival(Date arrival) {
        this.flight.setArrival(arrival);
        return this;
    }

    public Flight build() {
        return this.flight;
    }
}
