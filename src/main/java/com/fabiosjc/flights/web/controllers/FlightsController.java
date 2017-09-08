package com.fabiosjc.flights.web.controllers;

import com.fabiosjc.flights.core.repository.FlightRepository;
import com.fabiosjc.flights.model.domain.Flight;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fabio on 22/08/17.
 */
@RestController
@Api(value="Flights", description="Endpoint para obter informações sobre vôos")
public class FlightsController {

    @Autowired
    private FlightRepository repository;

    @RequestMapping(method = RequestMethod.GET, value = "/api/flights")
    public List<Flight> findAll(){
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/flights/{id}")
    public Flight findById(@PathVariable("id") long id){
        return repository.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/flights/airline/{code}")
    public List<Flight> findByAirline(@PathVariable("code") String code){
        return repository.findByAirline(code);
    }
}
