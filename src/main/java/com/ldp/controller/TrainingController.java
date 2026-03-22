package com.ldp.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/trainings")
public class TrainingController {

    @Autowired
    private TrainingService trainingService;

    // Endpoint to get all trainings
    @GetMapping
    public ResponseEntity<List<Training>> getAllTrainings() {
        List<Training> trainings = trainingService.getAllTrainings();
        return ResponseEntity.ok(trainings);
    }

    // Endpoint to search trainings
    @GetMapping("/search")
    public ResponseEntity<List<Training>> searchTrainings(@RequestParam String query) {
        List<Training> trainings = trainingService.searchTrainings(query);
        return ResponseEntity.ok(trainings);
    }

    // Endpoint to create a new training
    @PostMapping
    public ResponseEntity<Training> createTraining(@RequestBody TrainingRequest trainingRequest) {
        Training createdTraining = trainingService.createTraining(trainingRequest);
        return ResponseEntity.created(URI.create("/trainings/" + createdTraining.getId())).body(createdTraining);
    }
} 

// Assume Training and TrainingRequest classes are defined in your project

class Training {
    private Long id;
    private String name;
}

class TrainingRequest {
    private String name;
}