package com.techforce.assesment.serviceImpl;

import com.techforce.assesment.Model.Assessment;
import com.techforce.assesment.Repository.AssessmentRepsitory;
import com.techforce.assesment.dto.AssessmentDto;
import com.techforce.assesment.service.AssessmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AssessmentServiceImpl implements AssessmentService {
    private final AssessmentRepsitory repo;

//    @Override
    public Assessment createAssessment(AssessmentDto dto) {
        Assessment assessment = new Assessment();
        assessment.setTitle(dto.getTitle());
        assessment.setDescription(dto.getDescription());
        assessment.setDuration(dto.getDuration());

        return repo.save(assessment);
    }

}
