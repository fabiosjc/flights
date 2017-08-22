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
        Assert.assertEquals("Total de vôos diferente do esperado", flights.size(), 2);
    }

    @Test
    public void findByNumber() {
        Flight flight = flightRepository.findByNumber("FLY411");
        Assert.assertNotNull("Vôo deveria ter sido encontrado", flight);
    }

}