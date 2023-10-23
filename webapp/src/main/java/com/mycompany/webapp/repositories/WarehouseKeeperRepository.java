package com.mycompany.webapp.repositories;

import com.mycompany.webapp.entities.WarehouseKeeper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseKeeperRepository extends JpaRepository<WarehouseKeeper,Integer> {
}
