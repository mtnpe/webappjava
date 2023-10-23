package com.mycompany.webapp.repositories;

import com.mycompany.webapp.entities.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {
    Warehouse findById(int id);
}
