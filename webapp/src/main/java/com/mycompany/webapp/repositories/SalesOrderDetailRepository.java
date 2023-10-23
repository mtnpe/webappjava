package com.mycompany.webapp.repositories;

import com.mycompany.webapp.entities.SalesOrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesOrderDetailRepository extends JpaRepository<SalesOrderDetail,Integer> {
}
