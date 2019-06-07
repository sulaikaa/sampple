package com.qb.phd.pharmacy.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qb.phd.pharmacy.model.Regg;
@Repository
public interface ReggDao extends JpaRepository<Regg,Long>{

}
