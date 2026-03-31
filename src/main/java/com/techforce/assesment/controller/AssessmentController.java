package com.techforce.assesment.controller;

import com.techforce.assesment.Model.Assessment;
import com.techforce.assesment.dto.AssessmentDto;
import com.techforce.assesment.service.AssessmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AssessmentController {

    private final AssessmentService assessmentService;

    @PostMapping("/createAssessment")
    public ResponseEntity<Assessment> createAssessment(@RequestBody AssessmentDto dto) {
        Assessment createdAssessment = assessmentService.createAssessment(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAssessment);
    }
}