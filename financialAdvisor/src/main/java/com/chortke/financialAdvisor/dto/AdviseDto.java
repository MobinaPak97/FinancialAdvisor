package com.chortke.financialAdvisor.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Mobina Pak
 * @Date: 14/11/2019
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdviseDto extends BaseDto {

    private Long id;
    private Short rate;
}
