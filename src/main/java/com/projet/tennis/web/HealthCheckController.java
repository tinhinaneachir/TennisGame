package com.projet.tennis.web;

import com.projet.tennis.HealthCheck;
import com.projet.tennis.Player;
import com.projet.tennis.service.HealthCheckService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@Tag(name="HealtchCheck")
@RestController
public class HealthCheckController {

    @Autowired
    HealthCheckService healthCheckService;


    @Operation(summary = "Returns application status", description = "Returns the application status")

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "HealthCheck status with some details",
            content = {@Content(mediaType = "application/json",
            schema = @Schema(implementation = HealthCheck.class))})
    })

    @GetMapping("/healthcheck")
    public HealthCheck healthCheck(){
        return healthCheckService.healthCheck();
    }

    @PostMapping
    public Player createPlayer(@RequestBody Player player){
        return player;
    }

    @PutMapping
    public Player updatePlayer(@RequestBody Player player){
        return player;
    }

    @DeleteMapping("{{lastName}}")
    public void deletePlayerByLastName(@PathVariable("LastName") String LastName){

    }


}
