package com.fabiosjc.flights.core.repository;


import com.fabiosjc.flights.model.domain.Flight;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by fabio on 21/08/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.fabiosjc.flights.FlightsApplication.class)
public class FlightRepositoryTest {

    @Autowired
    private FlightRepository flightRepository;

    @Test
    public void findAll() throws Exception {
        List<Flight> flights = flightRepository.findAll();
        Assert.assertEquals("Total de vôos diferente do esperado", flights.size(), 3);
    }

    @Test
    public void findByNumber() {
        Flight flight = flightRepository.findByNumber("03184");
        Assert.assertNotNull("Vôo deveria ter sido encontrado", flight);
    }

    @Test
    public void checkFlightStatusLabel() {
        Flight flight = flightRepository.findByNumber("03184");
        Assert.assertEquals(flight.getFlightStatus().name(), "LANDED");
        Assert.assertEquals(flight.getFlightStatus().getLabel(), "Desembarcando");
    }

    @Test
    public void findById() {
        Flight flight = flightRepository.findById(Long.valueOf(1));
        Assert.assertNotNull("Vôo deveria ter sido encontrado", flight);
        Assert.assertEquals("Vôo não encontrado", flight.getNumber(), "00752");
    }

    @Test
    public void findByAirline() throws Exception {
        List<Flight> flights = flightRepository.findByAirline("tam");
        Assert.assertEquals("Total de vôos diferente do esperado", flights.size(), 2);
    }
}