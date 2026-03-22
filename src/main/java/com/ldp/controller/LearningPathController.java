package com.ldp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/learning-paths")
public class LearningPathController {

    @Autowired
    private LearningPathService learningPathService;

    @PostMapping
    public ResponseEntity<?> createLearningPath(@RequestBody LearningPathDto learningPathDto) {
        return ResponseEntity.ok(learningPathService.createLearningPath(learningPathDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateLearningPath(@PathVariable Long id, @RequestBody LearningPathDto learningPathDto) {
        return ResponseEntity.ok(learningPathService.updateLearningPath(id, learningPathDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLearningPath(@PathVariable Long id) {
        learningPathService.deleteLearningPath(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/trainings")
    public ResponseEntity<?> addTrainingToLearningPath(@PathVariable Long id, @RequestBody TrainingDto trainingDto) {
        return ResponseEntity.ok(learningPathService.addTrainingToLearningPath(id, trainingDto));
    }
}