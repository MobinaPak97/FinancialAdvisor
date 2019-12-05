package com.chortke.financialAdvisor.dto;

import com.chortke.financialAdvisor.enums.AdviseType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: Mobina Pak
 * @Date: 14/11/2019
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdviseApplicationDto extends BaseDto {

    private Long id;
    private AdviseType adviseType;
    private AdviseApplicantDto applicant;
    private List<AdviseDto> adviseList;
}
