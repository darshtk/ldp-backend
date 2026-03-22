package com.ldp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/report")
public class ReportController {

    @GetMapping("/user-progress")
    public String getUserProgress() {
        // Logic to retrieve user progress
        return "User Progress Data";
    }

    @GetMapping("/completion-rate")
    public String getCompletionRate() {
        // Logic to retrieve completion rate
        return "Completion Rate Data";
    }

    @GetMapping("/training-usage")
    public String getTrainingUsage() {
        // Logic to retrieve training usage
        return "Training Usage Data";
    }

    @GetMapping("/analytics")
    public String getAnalyticsReports() {
        // Logic to retrieve analytics reports
        return "Analytics Reports Data";
    }
}