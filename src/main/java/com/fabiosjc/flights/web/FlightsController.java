package com.fabiosjc.flights.web;

import com.fabiosjc.flights.core.repository.FlightRepository;
import com.fabiosjc.flights.model.domain.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fabio on 22/08/17.
 */
@RestController
public class FlightsController {

    @Autowired
    private FlightRepository repository;

    @RequestMapping(method = RequestMethod.GET, value = "/api/flights")
    public List<Flight> list(){
        return repository.findAll();
    }
}
