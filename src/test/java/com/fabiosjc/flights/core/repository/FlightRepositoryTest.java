package com.fabiosjc.flights.core.repository;


import com.fabiosjc.flights.core.builder.FlightBuilder;
import com.fabiosjc.flights.model.domain.City;
import com.fabiosjc.flights.model.domain.Flight;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

/**
 * Created by fabio on 21/08/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.fabiosjc.flights.FlightsApplication.class)
public class FlightRepositoryTest {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private CityRepository cityRepository;

    @Before
    public void setUp() throws Exception {
        this.flightRepository.deleteAll();

        City saoPaulo = cityRepository.save(new City("São Paulo"));
        City newYork = cityRepository.save(new City("New_York"));

        Flight flight311 = new FlightBuilder("FLY311").from(saoPaulo).to(newYork)
                .departure(getDepartureDate()).arrival(getArrivalDate()).build();

        Flight flight411 = new FlightBuilder("FLY411")
                .from(newYork).to(saoPaulo)
                .departure(getDepartureDate()).arrival(getArrivalDate())
                .build();

        flightRepository.save(flight311);
        flightRepository.save(flight411);
    }

    private Date getDepartureDate() {
        ZoneId saoPauloZone = ZoneId.of("America/Sao_Paulo");
        LocalDateTime departure = LocalDateTime.of(2018, Month.APRIL, 4, 22, 30);
        Instant instant = departure.atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

    private Date getArrivalDate() {
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        LocalDateTime arrival = LocalDateTime.of(2018, Month.APRIL, 5, 7, 10);
        Instant instant = arrival.atZone(ZoneId.systemDefault()).toInstant();

        return Date.from(instant);
    }

    @Test
    public void findAll() throws Exception {
        List<Flight> flights = flightRepository.findAll();
        Assert.assertEquals("Total de vôos diferente do esperado", flights.size(), 2);
    }

    @Test
    public void findByNumber() {
        Flight flight = flightRepository.findByNumber("FLY411");
        Assert.assertNotNull("Vôo deveria ter sido encontrado", flight);
    }

}