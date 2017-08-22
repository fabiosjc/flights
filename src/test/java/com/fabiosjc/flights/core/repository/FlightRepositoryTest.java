package com.fabiosjc.flights.core.repository;


import com.fabiosjc.flights.model.domain.Flight;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
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
    private FlightRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository.deleteAll();
        repository.save(new Flight("FLY311"));
        repository.save(new Flight("FLY411"));
    }

    @Test
    public void findAll() throws Exception {
        List<Flight> flights = repository.findAll();
        Assert.assertEquals("Total de vôos diferente do esperado", flights.size(), 2);
    }

    @Test
    public void findByNumber() {
        Flight flight = repository.findByNumber("FLY411");
        Assert.assertNotNull("Vôo deveria ter sido encontrado", flight);
    }

}