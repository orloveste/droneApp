package com.futureDroneV5K.droneApp.repositories;

import com.futureDroneV5K.droneApp.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
