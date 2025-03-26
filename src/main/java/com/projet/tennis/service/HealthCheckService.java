package com.projet.tennis.service;

import com.projet.tennis.ApplicationStatus;
import com.projet.tennis.HealthCheck;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    public HealthCheck healthCheck(){
        return new HealthCheck(ApplicationStatus.OK, "Welcom to the Tennis Game");
    };
}
