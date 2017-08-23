package com.fabiosjc.flights.core.repository;

import com.fabiosjc.flights.model.domain.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fabio on 20/08/17.
 */
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    Flight findByNumber(final String number);

    Flight findById(final Long ind);
}