package com.ldp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserProgressController {

    @GetMapping("/employee/{employeeId}/trainings/assigned")
    public List<String> getAssignedTrainings(@PathVariable Long employeeId) {
        // Logic to fetch assigned trainings for the employee
        return List.of("Training 1", "Training 2"); // Sample data
    }

    @GetMapping("/employee/{employeeId}/trainings/completed")
    public List<String> getCompletedTrainings(@PathVariable Long employeeId) {
        // Logic to fetch completed trainings for the employee
        return List.of("Training 3", "Training 4"); // Sample data
    }
}