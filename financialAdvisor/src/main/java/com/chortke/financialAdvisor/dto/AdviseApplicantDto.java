package com.chortke.financialAdvisor.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Mobina Pak
 * @Date: 12/5/2019
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdviseApplicantDto extends BaseDto {

    private Long id;
    private String monthlySalary;
    private String savedMoney;
}
