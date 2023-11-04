package com.saiprajit123.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.saiprajit123.demo.entity.Route;

@Repository
public interface RouteRepo extends JpaRepository<Route,Long> {
    
} 
