package com.fabiosjc.flights.core.repository;

import com.fabiosjc.flights.model.domain.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fabio on 20/08/17.
 */
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    Flight findByNumber(final String number);

    Flight findById(final Long ind);

    @Query("SELECT f FROM Flight f WHERE LOWER(f.airline.code) = LOWER(:airlineCode)")
    List<Flight> findByAirline(@Param("airlineCode") String airlineCode);
}