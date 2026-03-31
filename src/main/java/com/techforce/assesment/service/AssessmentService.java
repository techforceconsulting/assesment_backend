package com.techforce.assesment.service;

import com.techforce.assesment.Model.Assessment;
import com.techforce.assesment.dto.AssessmentDto;

public interface AssessmentService {
    Assessment createAssessment(AssessmentDto dto);
}
