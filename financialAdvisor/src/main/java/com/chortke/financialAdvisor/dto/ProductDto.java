package com.chortke.financialAdvisor.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author: Mobina Pak
 * @Date: 12/5/2019
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto extends BaseDto {

    private Long id;
    private String productName;
    private String description;
    private String uniqueCode;
}
