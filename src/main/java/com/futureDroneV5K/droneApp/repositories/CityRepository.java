package com.futureDroneV5K.droneApp.repositories;
import com.futureDroneV5K.droneApp.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
