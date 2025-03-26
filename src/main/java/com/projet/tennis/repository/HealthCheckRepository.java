package com.projet.tennis.repository;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HealthCheckRepository {

    @Autowired
    private EntityManager entityManager;
}
