package com.saiprajit123.demo.services;
import com.saiprajit123.demo.entity.Route;
import com.saiprajit123.demo.repository.RouteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {
    @Autowired
    private RouteRepo routeRepo;

    public List<Route> getAllRoutes() {
        return routeRepo.findAll();
    }

    public Route getRouteById(Long id) {
        return routeRepo.findById(id).orElse(null);
    }

    public Route createRoute(Route route) {
        return routeRepo.save(route);
    }

    public Route updateRoute(Long id, Route updatedRoute) {
        if (routeRepo.existsById(id)) {
            updatedRoute.setUid(id);
            return routeRepo.save(updatedRoute);
        }
        return null;
    }

    public void deleteRoute(Long id) {
        routeRepo.deleteById(id);
    }
}

