package com.fabiosjc.flights.core.repository;

import com.fabiosjc.flights.model.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fabio on 22/08/17.
 */
@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
