package com.futureDroneV5K.droneApp.repositories;

import com.futureDroneV5K.droneApp.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
